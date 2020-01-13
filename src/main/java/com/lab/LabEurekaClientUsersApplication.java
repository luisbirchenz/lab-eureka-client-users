package com.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class LabEurekaClientUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabEurekaClientUsersApplication.class, args);
	}

}
