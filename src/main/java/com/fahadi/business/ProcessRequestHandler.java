/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahadi.business;

import com.fahadi.person.IdDetail;
import com.fahadi.person.MyFaultDetailMessage;
import com.fahadi.person.PersonDetail;

/**
 *
 * @author developer
 */
public interface ProcessRequestHandler {
    
    PersonDetail findPersonDetail(IdDetail id) throws MyFaultDetailMessage;
    boolean AddPersonDetail(PersonDetail personDetail);
    
}
