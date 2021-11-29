package com.example.visa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class VisaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VisaApplication.class, args);
	}

}
