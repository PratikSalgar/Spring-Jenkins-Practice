package com.springJenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkins1Application {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkins1Application.class);
	
	public static void main(String[] args) {
		
		System.out.println("Spring application started..");
		SpringApplication.run(SpringJenkins1Application.class, args);
		
	}

}
