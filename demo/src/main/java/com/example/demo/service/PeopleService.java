package com.example.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.model.Person;

@Service
public class PeopleService {
    private List<Person> data = List.of(
        new Person(1, "John", "Doe"),
        new Person(2, "Jane", "Doe"),
        new Person(3, "Jim", "Beam"),
        new Person(4, "Jack", "Daniels")
    );
    
    public List<Person> findPeople() {
        return data;
    }
}