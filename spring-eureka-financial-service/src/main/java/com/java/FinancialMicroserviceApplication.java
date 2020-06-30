package com.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.github.kristofa.brave.Sampler;


@SpringBootApplication
@EnableEurekaClient
public class FinancialMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancialMicroserviceApplication.class, args);
	}
}

@RestController
class Microservice4Controller {

	@Autowired
	RestTemplate restTemplate;

	@Bean
	public Sampler defaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}
	
	private  final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@GetMapping(value = "/validate")
	public String financialMicroservice() {
		return "student is approved";
	}
}