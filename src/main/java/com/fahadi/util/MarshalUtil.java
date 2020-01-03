/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahadi.util;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author developer
 */
public class MarshalUtil<T> {
    
    private T classT;
    
    public MarshalUtil(T classT){
        this.classT = classT;
    }
    
    
    public Marshaller getMarshaller() throws JAXBException{
        JAXBContext jAXBContext = JAXBContext.newInstance(this.classT.getClass());
        Marshaller marshaller = jAXBContext.createMarshaller();
        return marshaller;
    }
    
}
