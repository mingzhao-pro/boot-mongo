package com.example.demo;

import org.springframework.data.annotation.Id;

/**
 * Created by ming on 6/22/17.
 */

public class Person {
    @Id
    public String id;

    public String firstName;
    public String lastName;

    public Person() {}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }
}
