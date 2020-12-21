package com.hannStar.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(
		scanBasePackages = "com.hannStar.core, com.hannStar.restful"
		)
public class StartSpringBootRestfulMain extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(StartSpringBootRestfulMain.class, args);
	}

	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		return builder.sources(StartSpringBootRestfulMain.class);
	}
}
