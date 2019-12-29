/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahadi.service;

import com.fahadi.model.PersonId;
import com.fahadi.model.PersonModel;
import com.fahadi.repository.Repo;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author developer
 */
@Component
public class PersonDetailServiceImpl implements PersonDetailService{
    
    private final Repo repo;
    
    @Autowired
    public PersonDetailServiceImpl(Repo repo){
        this.repo = repo;
    }
    

    @Override
    public boolean addPersonDetail(PersonModel personModel) {
        this.repo.getRepo().put(personModel, "Value");
        return true;
    }

    @Override
    public PersonModel getPersonDetail(PersonId personId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
