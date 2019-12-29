/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahadi.PersonDetail;

import com.fahadi.model.PersonModel;
import com.fahadi.repository.PersonDetailMap;
import com.fahadi.repository.Repo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author developer
 */

@Configuration
public class PersonDetailConfig {
    
   @Bean
   public Repo<PersonModel,String> personDetaillMap(){
       return new PersonDetailMap<PersonModel,String>();
   }
    
}
