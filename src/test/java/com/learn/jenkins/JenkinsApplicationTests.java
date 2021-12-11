package com.learn.jenkins;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinsApplicationTests.class);

	@Test
	 contextLoads() throws Exception {
		Assertions.assertEquals(true, true);
		logger.info("Test case executing...");
		logger.info("Test case executing again this...");
	}

}
