package com.iqbusiness.controller;

import com.iqbusiness.model.Person;
import com.iqbusiness.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/iqbusiness")
public class RegistrationController {

    final PersonService personService;

    public RegistrationController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping(value = "/person")
    public Person register(@RequestBody Person person){
        return personService.register(person);
    }

    @GetMapping(value = "/persons")
    public List<Person> retrieveAll(){
        return personService.retrieveAll();
    }
}
