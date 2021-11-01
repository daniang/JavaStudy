package study.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import study.interceptor.LoginInterceptor;

import javax.annotation.Resource;

@Configuration
@Slf4j
public class MyMvcConfig implements WebMvcConfigurer {

    @Resource
    private LoginInterceptor loginInterceptor;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //当访问"/"或"index.html" 时,都直接跳转到登录页面
        registry.addViewController("/").setViewName("login");
        registry.addViewController("index.html").setViewName("login");
        registry.addViewController("/main.html").setViewName("main");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        log.info("注册拦截器");
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**").
                excludePathPatterns("/", "/login", "/index.html", "/user/login", "/css/**", "/images/**", "/js/**", "fongts/**");
    }



}
