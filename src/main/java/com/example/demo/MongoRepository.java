package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by ming on 6/22/17.
 */
    interface CustomerRepository extends MongoRepository<Person, String> {

        public Person findByFirstName(String firstName);
        public List<Person> findByLastName(String lastName);

    }
