/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahadi.repository;

import java.util.Map;

/**
 *
 * @author developer
 */
public interface Repo<K,V> {
    
    Map<K,V> getRepo();
}
