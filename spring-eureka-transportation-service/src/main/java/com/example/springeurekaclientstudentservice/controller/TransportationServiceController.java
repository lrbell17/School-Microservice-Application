package com.example.springeurekaclientstudentservice.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.springeurekaclientstudentservice.domain.Transportation;

@RestController
public class TransportationServiceController {
	
	@Autowired
	RestTemplate restTemplate;

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	private static Map<String, List<Transportation>> transDB = new HashMap<String, List<Transportation>>();
	
	private  final Logger LOG = LoggerFactory.getLogger(this.getClass());

	static {
		transDB = new HashMap<String, List<Transportation>>();

		List<Transportation> lst = new ArrayList<Transportation>();
		Transportation trans = new Transportation("School bus", 99.99);
		lst.add(trans);
		trans = new Transportation("Curbside Pickup", 0.00);
		lst.add(trans);

		transDB.put("abcschool", lst);

		lst = new ArrayList<Transportation>();
		trans = new Transportation("Carpool", 25.00);
		lst.add(trans);
		trans = new Transportation("Private Jet", 999999.99);
		lst.add(trans);

		transDB.put("xyzschool", lst);

	}

	@RequestMapping(value = "/getTransDetailsForSchool/{schoolname}", method = RequestMethod.GET)
	public List<Transportation> getStudents(@PathVariable String schoolname) {
		System.out.println("Getting Student details for " + schoolname);
		
		String baseUrl = "http://localhost:8083/validate";
		String response = (String) restTemplate.exchange(baseUrl, HttpMethod.GET, null, String.class).getBody();
		System.out.println(response);

		List<Transportation> transList = transDB.get(schoolname);
		if (transList == null) {
			transList = new ArrayList<Transportation>();
			Transportation trans = new Transportation("Not Found", 0.00);
			transList.add(trans);
		}
		return transList;
	}
}
