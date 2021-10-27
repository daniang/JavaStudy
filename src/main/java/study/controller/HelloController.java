package study.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.model.Person;
import study.service.PersonService;

import javax.annotation.Resource;

@RestController
@RequestMapping("helloController")
public class HelloController {


    @Autowired
    private Person person;
    @Autowired
    private ApplicationContext ioc;

    @Autowired
    private PersonService personService;

    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    /**
     * 测试
     * @return
     */
    @GetMapping("/hello")
    public String hello(){
        boolean b = ioc.containsBean("personService");
        if (b) {
            System.out.println("personService已经添加到IOC容器中");
        } else {
            System.out.println("personService没添加到IOC容器中");
        }

        return "hello World!!";
    }

    @GetMapping("/getPerson")
    public Person getPerson(){
        logger.trace("hello{}",person.getLastName());
        logger.debug("hello{}",person.getLastName());
        logger.info("hello{}",person.getLastName());
        logger.warn("hello{}",person.getLastName());
        logger.error("hello{}",person.getLastName());
        return personService.getPersonInfo();
    }
}
