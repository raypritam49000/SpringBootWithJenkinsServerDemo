package com.spring.jenkins.server.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringBootWithJenkinsServerDemoApplicationTests {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootWithJenkinsServerDemoApplicationTests.class);

	@Test
	void contextLoads() {
		LOGGER.info("Application Executed....");
		assertEquals(true, true);
	}

}
