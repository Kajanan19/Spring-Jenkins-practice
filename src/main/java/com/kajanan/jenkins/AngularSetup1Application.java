package com.kajanan.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AngularSetup1Application {
	
	public static Logger logger= LoggerFactory.getLogger(AngularSetup1Application.class);
	
	@PostConstruct
	public void intt() {
		logger.info("Application Started");
	}

	public static void main(String[] args) {
		logger.info("Application Started");
		SpringApplication.run(AngularSetup1Application.class, args);
	}

}
