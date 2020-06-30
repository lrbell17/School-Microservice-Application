package com.example.springeurekaclientschoolservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.github.kristofa.brave.Sampler;

@RestController
public class SchoolServiceController {
	@Autowired
	RestTemplate restTemplate;

	private  final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value = "/getSchoolDetails/{schoolname}", method = RequestMethod.GET)
	public String getStudents(@PathVariable String schoolname) {
		System.out.println("Getting School details for " + schoolname);
		
		String response = restTemplate.exchange("http://student-service/getStudentDetailsForSchool/{schoolname}", 
				HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}, schoolname).getBody();

		System.out.println("Response Received as " + response);

		
		LOG.info("inside school-service");
		
		return "School Name -  " + schoolname + " \n Student Details " + response;
	}
	
	@RequestMapping(value = "/getTransDetails/{schoolname}", method = RequestMethod.GET)
	public String getTransportation(@PathVariable String schoolname) {
		System.out.println("Getting Transportation details for " + schoolname);
		
		String response = restTemplate.exchange("http://transportation-service/getTransDetailsForSchool/{schoolname}", 
				HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}, schoolname).getBody();

		System.out.println("Response Received as " + response);
		
		LOG.info("inside school-service");

		return "School Name -  " + schoolname + " \n Transportation Details " + response;
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
