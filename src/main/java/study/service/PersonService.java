package study.service;

import org.springframework.stereotype.Service;
import study.model.Person;

@Service
public interface PersonService {

    public Person getPersonInfo();
}
