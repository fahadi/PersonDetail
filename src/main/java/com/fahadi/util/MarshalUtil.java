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

    private final T classT;

    public MarshalUtil(final T classT) {
        this.classT = classT;
    }

    public Marshaller getMarshaller() throws JAXBException {
        final JAXBContext jAXBContext = JAXBContext.newInstance(this.classT.getClass());
        final Marshaller marshaller = jAXBContext.createMarshaller();
        return marshaller;
    }

}
