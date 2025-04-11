package com.example.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Person;

@RestController
public class PersonController {
    private List<Person> data = List.of(
        new Person(1, "John", "Doe"),
        new Person(2, "Jane", "Doe"),
        new Person(3, "Jim", "Beam"),
        new Person(4, "Jack", "Daniels")
    );

    @GetMapping("/api/people")
    public List<Person> getAll() {
        return data;
    }
    
}