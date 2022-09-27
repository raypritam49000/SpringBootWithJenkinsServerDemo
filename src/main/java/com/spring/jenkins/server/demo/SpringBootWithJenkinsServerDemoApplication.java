package com.spring.jenkins.server.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWithJenkinsServerDemoApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootWithJenkinsServerDemoApplication.class);

	@PostConstruct
	public void init() {
		LOGGER.info("Application Started....");
	}
	
	public static void main(String[] args) {
		LOGGER.info("Application Executed....");
		SpringApplication.run(SpringBootWithJenkinsServerDemoApplication.class, args);
	}


}
