package com.iqbusiness.service;

import com.iqbusiness.model.Person;
import com.iqbusiness.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PersonServiceBean implements PersonService{

    final PersonRepository personRepository;

    public PersonServiceBean(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person register(Person person) {
        return personRepository.save(person);
    }

    @Override
    public List<Person> retrieveAll() {
        return personRepository.findAll();
    }
}
