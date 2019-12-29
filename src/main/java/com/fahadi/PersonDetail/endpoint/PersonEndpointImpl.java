/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahadi.PersonDetail.endpoint;

import com.fahadi.person.IdDetail;
import com.fahadi.person.PersonDetail;
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

    @Override
    @PayloadRoot(namespace = "http://fahadi.com/Person.wsdl", localPart = "IdDetail")
    @ResponsePayload
    public PersonDetail getPersonDetail(@RequestPayload IdDetail id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
