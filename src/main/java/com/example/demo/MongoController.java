package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ming on 6/22/17.
 */
@RestController
public class MongoController {
    @Autowired
    private MongoRepository mongo;

    @RequestMapping("/")
    public String getHello() {
        return "Hello";
    }

    @RequestMapping("/get")
    public Person getPersonByName() {
        Person p = new Person("z", "m");
        return p;
    }

    @RequestMapping("/save")
    public Person setPerson() {
        Person p = new Person("z", "mm");
        mongo.save(p);
        return p;
    }
}
