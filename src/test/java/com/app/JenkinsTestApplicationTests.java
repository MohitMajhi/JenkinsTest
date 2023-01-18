package com.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsTestApplicationTests {
	
	static Logger logger=LoggerFactory.getLogger(JenkinsTestApplication.class);

	@Test
	void contextLoads() {
	}

	@Test
	public void testJenkins()
	{
		logger.info("Inside Jenkins Spring boot Test Class");
		assertEquals(true, true);
	}
}
