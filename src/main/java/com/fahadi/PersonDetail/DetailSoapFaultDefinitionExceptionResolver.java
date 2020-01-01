/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahadi.PersonDetail;

import com.fahadi.person.MyFaultDetail;
import com.fahadi.person.MyFaultDetailMessage;
import com.fahadi.person.ObjectFactory;
import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import org.springframework.oxm.Marshaller;
import org.springframework.ws.soap.SoapFault;
import org.springframework.ws.soap.SoapFaultDetail;
import org.springframework.ws.soap.server.endpoint.SoapFaultMappingExceptionResolver;

/**
 *
 * @author developer
 */
public class DetailSoapFaultDefinitionExceptionResolver extends 
        SoapFaultMappingExceptionResolver {
    
     @Override
    protected void customizeFault(Object endpoint, Exception ex, SoapFault fault) {
        logger.warn("Exception processed ", ex);
        if (ex instanceof MyFaultDetailMessage) {
            MyFaultDetail serviceFault = ((MyFaultDetailMessage) ex).getFaultInfo();
            SoapFaultDetail detail = fault.addFaultDetail();
        }
    }
    
}
