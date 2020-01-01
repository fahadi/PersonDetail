/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahadi.business;

import com.fahadi.model.PersonId;
import com.fahadi.model.PersonModel;
import com.fahadi.person.IdDetail;
import com.fahadi.person.MyFaultDetail;
import com.fahadi.person.MyFaultDetailMessage;
import com.fahadi.person.ObjectFactory;
import com.fahadi.person.PersonDetail;
import com.fahadi.service.PersonDetailService;
import java.math.BigInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author developer
 */
@Component
public class ProcessRequestHandlerImpl implements ProcessRequestHandler {

    private static final Logger logger = LoggerFactory.getLogger(ProcessRequestHandlerImpl.class);
    private final PersonDetailService personDetailService;
    
    
    @Autowired
    public ProcessRequestHandlerImpl(PersonDetailService personDetailService){
        this.personDetailService = personDetailService;
    }

    @Override
    public PersonDetail findPersonDetail(IdDetail id) throws MyFaultDetailMessage{

        logger.info("Calling findPersonDetail");
        PersonId personId = new PersonId(id.getId());
        logger.info("Calling personDetailService");
        PersonModel personModel = personDetailService.getPersonDetail(personId);
        
        if (personModel != null) {
            logger.info("Creating PersonDetail Schema object");
            ObjectFactory ob = new ObjectFactory();
            PersonDetail personDetail = ob.createPersonDetail();
            personDetail.setAge(BigInteger.valueOf(personModel.getAge()));
            personDetail.setFirstName(personModel.getFirstName());
            personDetail.setLastName(personModel.getLastName());
            logger.info("Returning personDetail schema ");
            return personDetail;
        }
        logger.error("personDetailService found no reference");
        String message="personDetailService found no reference";
        MyFaultDetail faultInfo = new MyFaultDetail();
        faultInfo.setErrorCode(BigInteger.valueOf(1000));
        faultInfo.setErrorType("Failed to find Person Detail");
        throw new MyFaultDetailMessage(message,faultInfo);
    }

    @Override
    public boolean AddPersonDetail(PersonDetail personDetail) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

}
