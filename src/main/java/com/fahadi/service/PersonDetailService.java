/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahadi.service;

import com.fahadi.model.PersonId;
import com.fahadi.model.PersonModel;
import com.fahadi.person.IdDetail;
import com.fahadi.person.PersonDetail;

/**
 *
 * @author developer
 */
public interface PersonDetailService {
    
    boolean addPersonDetail(PersonModel PersonModel);
    
    PersonModel getPersonDetail(PersonId personId);
    
}
