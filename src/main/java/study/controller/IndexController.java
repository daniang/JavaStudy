package study.controller;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import study.model.User;

import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Map;

@Controller
@EnableAutoConfiguration
@RequestMapping("/user")
@Slf4j
public class IndexController {

    @Autowired
    private DataSource dataSource;


    @Autowired
    private JdbcTemplate jdbcTemplate;


    @GetMapping(value = "/loginPage")
    public String loginPage() throws SQLException {
        log.info("默认数据源为：{}",dataSource.getClass());
        log.info("数据库连接实例：{}",dataSource.getConnection());
        //访问数据库
        long i = jdbcTemplate.queryForObject("select count(*) from inf_terminal",Long.class);
        log.info("inf_terminal表中共有{}条数据",i);
        return "/login";
    }

    @PostMapping("/login")
    public String doLogin(User user, Map<String, Object> map, HttpSession session) {
        log.info("用户名{},密码{}", user.getUsername(), user.getPassword());
        if (user != null && "张三".equals(user.getUsername()) && "123456".equals(user.getPassword())) {
            session.setAttribute("loginUser", user);
            log.info("登录成功，用户名:{}", user.getUsername());
            return "redirect:/main.html";
        } else {
            map.put("msg", "用户名或密码错误");
            log.error("登录失败");
            return "login";
        }


    }


}
