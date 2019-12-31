/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahadi.repository;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author developer
 */

public class PersonDetailMap<K,V> implements Repo<K,V>{
    
    private Map<K,V> map;
    
    public PersonDetailMap(){
        this.map = new HashMap<K,V>();
    }

    @Override
    public Map<K,V> getRepo() {
        return this.map;
    }
    
    

    
}
