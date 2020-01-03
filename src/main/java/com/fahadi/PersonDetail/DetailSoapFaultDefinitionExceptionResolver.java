/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahadi.PersonDetail;

import com.fahadi.util.MarshalUtil;
import com.fahadi.person.MyFaultDetail;
import com.fahadi.person.MyFaultDetailMessage;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.ws.soap.SoapFault;
import org.springframework.ws.soap.SoapFaultDetail;
import org.springframework.ws.soap.server.endpoint.SoapFaultMappingExceptionResolver;

/**
 *
 * @author developer
 */
public class DetailSoapFaultDefinitionExceptionResolver extends 
        SoapFaultMappingExceptionResolver {
    
    private static final Logger logger = LoggerFactory.getLogger(DetailSoapFaultDefinitionExceptionResolver.class);
    
    @Override
    protected void customizeFault(Object endpoint, Exception ex, 
            SoapFault fault) {
        logger.warn("Exception processed ", ex.getLocalizedMessage());
        if (ex instanceof MyFaultDetailMessage) {
            final MyFaultDetail serviceFault = ((MyFaultDetailMessage) ex).getFaultInfo();
            final SoapFaultDetail detail = fault.addFaultDetail();
            final Result result = detail.getResult();
            try {
                final MarshalUtil<MyFaultDetail> marshalUtil = new MarshalUtil<>(serviceFault);
                final Marshaller marshaller = marshalUtil.getMarshaller();
                marshaller.marshal(serviceFault,result);
            } catch (JAXBException ex1) {
                logger.error(ex1.getMessage());
            }
        }
    }
    
}
