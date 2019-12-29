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
public interface PersonEndpoint {
    PersonDetail getPersonDetail(@RequestPayload IdDetail id);
    
}
