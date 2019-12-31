/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahadi.model;

/**
 *
 * @author developer
 */
final public class PersonId {
    
    private final String uuid;

    public PersonId(final String uuid) {
        this.uuid = uuid;
    }
    
    public String getUuid() {
        return uuid;
    }
    
}
