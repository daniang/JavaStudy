package study.controller;

import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.dao.InfTerminalMapper;
import study.model.InfTerminal;
import study.model.Person;
import study.utils.ResultVo;

import javax.annotation.Resource;

@RestController
@Api(tags = "1800")
@RequestMapping("helloController")
public class HelloController {




    @Resource
    private InfTerminalMapper terminalMapper;

    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    /**
     * 测试
     * @return
     */
    @GetMapping("/infTerminal")
    public ResultVo<InfTerminal> hello(){
        InfTerminal infTerminal = terminalMapper.selectByPrimaryKey("013182137614");

        return ResultVo.success(infTerminal);
    }

    @GetMapping("/getPerson")
    public Person getPerson(){

        return null;
    }
}
