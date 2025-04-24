package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Person;
import com.example.demo.service.PeopleService;

@RestController
public class PersonController {
    @Autowired
    private PeopleService peopleService;

    @GetMapping("/api/people")
    public List<Person> getAll() {
        return peopleService.findPeople();
    }
    
}