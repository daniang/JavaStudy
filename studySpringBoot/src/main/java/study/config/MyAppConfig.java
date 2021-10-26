package study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.service.PersonService;
import study.service.impl.PersonServiceImpl;

@Configuration
public class MyAppConfig {

    @Bean
    public PersonService personService(){
        return new PersonServiceImpl();
    }
}
