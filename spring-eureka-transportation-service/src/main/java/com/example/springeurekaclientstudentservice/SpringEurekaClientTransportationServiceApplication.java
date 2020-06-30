package com.example.springeurekaclientstudentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringEurekaClientTransportationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaClientTransportationServiceApplication.class, args);
	}
}
