package com.edtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.edtech")
//@EnableJpaRepositories(basePackages = "com.edtech")
//@EntityScan(basePackages = "com.edtech")
public class ProjectEdtechApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectEdtechApplication.class, args);
	}
	
}