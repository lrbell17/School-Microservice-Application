package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

import com.entity.FinanceData;
import com.entity.Student;
import com.entity.Transportation;



@Service
public class ExchangeService {
	
	@Autowired
	RestTemplate restTemplate;
	

	// student info
	public Student[] getStudents(String schoolname) {

		ResponseEntity<Student[]> response = restTemplate.getForEntity("http://student-service/"
				+ "getstudentdetails/{schoolname}", 
				Student[].class, schoolname);
		
		return response.getBody();
		
	}
	
	// transportation info
	public Transportation[] getTransportation(String schoolname) {

		ResponseEntity<Transportation[]> response = restTemplate.getForEntity("http://transportation-service/"
				+ "gettransdetails/{schoolname}", 
				Transportation[].class, schoolname);
		
		return response.getBody();
		
	}
	
	// financial info
	public FinanceData getFinancial(String schoolname) {
		
		FinanceData response =  restTemplate.getForObject("http://financial-service/getfinancedetails/{schoolname}",
				FinanceData.class, schoolname);
		
		return response;
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
