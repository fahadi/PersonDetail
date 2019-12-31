/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahadi.service;

import com.fahadi.model.PersonId;
import com.fahadi.model.PersonModel;
import com.fahadi.repository.Repo;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author developer
 */
@Service
public class PersonDetailServiceImpl implements PersonDetailService{
    
    private static final Logger logger = LoggerFactory.getLogger(PersonDetailServiceImpl.class);
    
    @Autowired
    private Repo personDetailMap;
    
    
    @PostConstruct
    public void init() throws Exception{
        logger.info("Initialised Service");
        PersonModel p1 = new PersonModel("Fahad", "Ifthkar", new Integer(43));
        PersonModel p2 = new PersonModel("Sajjad", "Ifthkar", new Integer(39));
        
        logger.info("Initialised Service p1 uuid "+p1.getUuid());
        logger.info("Initialised Service p2 uuid "+p2.getUuid());
        
        if(personDetailMap == null){
            logger.error("Map is null");
        }
        this.personDetailMap.getRepo().put(p1, p1.getUuid());
        this.personDetailMap.getRepo().put(p2, p2.getUuid());
        logger.info("personDetailMap size is "+this.personDetailMap.getRepo().size());
    }
    
    @Override
    public boolean addPersonDetail(PersonModel personModel) {
        /*
        this.personDetailMap.getRepo().put(personModel, personModel.getUuid());
        */
        return true;
    }

    @Override
    public PersonModel getPersonDetail(PersonId personId) {
        final Map<PersonModel,String> map = this.personDetailMap.getRepo();
        for (Map.Entry<PersonModel,String> entry : map.entrySet()) {
            if(entry.getValue().equals(personId.getUuid())){
                logger.info("Found personId");
                return entry.getKey();
            }
        }
        logger.info("Not found personId");
        return null;
    }
    
    
    
}
