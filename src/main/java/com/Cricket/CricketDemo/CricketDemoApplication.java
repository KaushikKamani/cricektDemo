package com.Cricket.CricketDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication

@PropertySource({ "classpath:application.properties" })

public class CricketDemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		final Logger log = LoggerFactory.getLogger(CricketDemoApplication.class);
		
		try {
			SpringApplication.run(CricketDemoApplication.class, args);
			System.out.println("Cricket Application Started.");
		} catch (Exception e) {
			log.info("Exception occurred while Starting Application :" + e);
		}
	}

}
