package com.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Transportation;
import com.service.TransService;

@RestController
public class TransServiceController {

	@Autowired
	private TransService transService;
	
	@GetMapping("/addtrans")
	public String addTrans() {
		Transportation t1 = new Transportation("Santa Cruz High School", "school bus", 100.00);
		Transportation t2 = new Transportation("Santa Cruz High School","reserved bike lock", 25.00);
		Transportation t3 = new Transportation("Santa Cruz High School", "curbside pickup", 0.00);
		Transportation t4 = new Transportation("Santa Cruz High School", "parking pass", 50.00);
		
		Transportation t5 = new Transportation("Harbor High School", "Uber", 500.00);
		Transportation t6 = new Transportation("Harbor High School", "private jet", 999999.99);
		Transportation t7 = new Transportation("Harbor High School", "hang gliding", 3000.00);
		Transportation t8 = new Transportation("Harbor High School", "scuba diving", 1132.12);
		
		transService.addTrans(t1);
		transService.addTrans(t2);
		transService.addTrans(t3);
		transService.addTrans(t4);
		transService.addTrans(t5);
		transService.addTrans(t6);
		transService.addTrans(t7);
		transService.addTrans(t8);

		return "Transportation details added";
	}

	@GetMapping("/gettransdetails/{schoolname}")
	public List<Transportation> getTrans(@PathVariable String schoolname) {
		
		List<Transportation> refinedList = new ArrayList<Transportation>();
		List<Transportation> transList = transService.findAll();

		// adding vals that match school name
		for (Transportation t : transList) {
			if (t.getSchoolName().equalsIgnoreCase(schoolname)) {
				refinedList.add(t);
			}
		}
		
		
		if (refinedList.isEmpty()) {
			Transportation trans = new Transportation("Not Found", "N/A", 0.00);
			refinedList.add(trans);
		}
		
		
		return refinedList;
	}
}
