package com.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestApplication implements CommandLineRunner{
	
	public final static Logger logger=LoggerFactory.getLogger(JenkinsTestApplication.class);

	public static void main(String[] args) {
		logger.info("Log for main Jenkins Integration");
		SpringApplication.run(JenkinsTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Second jenkins Log");
		
	}

}
