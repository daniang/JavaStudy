package study.controller;

import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.model.Person;
import study.utils.ResultVo;

import javax.annotation.Resource;

@RestController
@Api(tags = "1800")
@RequestMapping("helloController")
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/getPerson")
    public Person getPerson(){

        return null;
    }
}
