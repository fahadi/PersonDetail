/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahadi.model;

import java.util.UUID;

/**
 *
 * @author developer
 */
final public class PersonModel {

    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final UUID uuid;

    public PersonModel(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.uuid = UUID.randomUUID();
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getUuid() {
        return uuid.toString();
    }    
}
