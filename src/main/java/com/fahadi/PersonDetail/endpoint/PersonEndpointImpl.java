/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahadi.PersonDetail.endpoint;

import com.fahadi.business.ProcessRequestHandler;
import com.fahadi.person.IdDetail;
import com.fahadi.person.MyFaultDetailMessage;
import com.fahadi.person.PersonDetail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
    
    private static final Logger logger = LoggerFactory.getLogger(PersonEndpointImpl.class);
    private final ProcessRequestHandler processRequestHandler;
    
    @Autowired
    public PersonEndpointImpl(final ProcessRequestHandler processRequestHandler){
        this.processRequestHandler = processRequestHandler;
    }

    @Override
    @PayloadRoot(namespace = "http://fahadi.com/Person.wsdl", localPart = "IdDetail")
    @ResponsePayload
    public PersonDetail getPersonDetail(@RequestPayload final IdDetail id) throws MyFaultDetailMessage {
        logger.info("getPersonDetail called successfully");
        return processRequestHandler.findPersonDetail(id);
    }
    
    
}
