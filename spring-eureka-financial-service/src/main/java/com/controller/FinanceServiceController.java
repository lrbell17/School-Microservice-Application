package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.entity.FinanceData;
import com.service.FinanceService;

@RestController
public class FinanceServiceController {

	@Autowired
	private FinanceService financeService;
	
	@GetMapping("/addfinancedata")
	public String addFinanceData() {
		
		FinanceData f1 = new FinanceData("Santa Cruz High School", 0.00, 250.00, false);
		FinanceData f2 = new FinanceData("Harbor High School", 10000.00, 500.00, true);
		
		financeService.addFinanceData(f1);
		financeService.addFinanceData(f2);
		
		return "Financial data added";
	}

	@GetMapping("/getfinancedetails/{schoolname}")
	public FinanceData getFinanceData(@PathVariable String schoolname) {
		
		FinanceData financeData = financeService.findBySchoolName(schoolname);
		
		if (financeData == null) {
			financeData = new FinanceData("N/A", 0.00, 0.00, false);
		}
		
		return financeData;
	}
}
