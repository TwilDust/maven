package com.campus.core;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Person {
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}
