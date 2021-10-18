package com.iqbusiness.service;

import com.iqbusiness.model.Person;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PersonService {
    Person register(Person person);
    List<Person> retrieveAll();
}
