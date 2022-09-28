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
		LOGGER.info("Test1 Case Executed....");
		LOGGER.info("Test2 Case Executed....");
		LOGGER.info("Test3 Case Executed....");
		LOGGER.info("Test4 Case Executed....");
		assertEquals(true, true);
	}

	@Test
	void init() {
		LOGGER.info("Test5 Case Executed....");
		LOGGER.info("Test6 Case Executed....");
		LOGGER.info("Test7 Case Executed....");
		LOGGER.info("Test8 Case Executed....");
		assertEquals(true, true);
	}

}
