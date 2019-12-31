package com.fahadi.PersonDetail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.fahadi.*"})
@SpringBootApplication
public class PersonDetailApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonDetailApplication.class, args);
	}

}
