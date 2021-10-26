package study.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import study.model.Person;
import study.service.PersonService;

public class PersonServiceImpl implements PersonService {

    @Autowired
    private Person person;

    @Override
    public Person getPersonInfo() {
        return person;
    }
}
