package com.ferhad.eurekaserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
	private static final Logger logger = LoggerFactory.getLogger("Eureka Server");

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
		logger.info("Eureka Server has been started...");
	}

}
