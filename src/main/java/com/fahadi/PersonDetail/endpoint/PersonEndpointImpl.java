/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahadi.PersonDetail.endpoint;

import com.fahadi.model.PersonId;
import com.fahadi.model.PersonModel;
import com.fahadi.person.IdDetail;
import com.fahadi.person.ObjectFactory;
import com.fahadi.person.PersonDetail;
import com.fahadi.repository.PersonDetailMap;
import com.fahadi.service.PersonDetailServiceImpl;
import java.math.BigInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 *
 * @author developer
 */
@Endpoint
public class PersonEndpointImpl implements PersonEndpoint{
    
    @Autowired
    private  PersonDetailServiceImpl personDetailService;
    
    
    private static final Logger logger = LoggerFactory.getLogger(PersonEndpointImpl.class);

    @Override
    @PayloadRoot(namespace = "http://fahadi.com/Person.wsdl", localPart = "IdDetail")
    @ResponsePayload
    public PersonDetail getPersonDetail(@RequestPayload IdDetail id) {
        logger.info("getPersonDetail called successfully");
        
        PersonId personId = new PersonId(id.getId());
        PersonModel personModel = personDetailService.getPersonDetail(personId);
        
        ObjectFactory ob = new ObjectFactory();
        PersonDetail personDetail = ob.createPersonDetail();
        
        personDetail.setAge(BigInteger.valueOf(personModel.getAge()));
        personDetail.setFirstName(personModel.getFirstName());
        personDetail.setLastName(personModel.getLastName());
        
        return personDetail;
    }

   
}
