package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.FinanceData;
import com.entity.Student;
import com.entity.Transportation;
import com.service.ExchangeService;

@Controller
public class SchoolClientController {

	private static boolean validUser = false;
	
	@Autowired
	private ExchangeService exchangeService;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	public String validateUser(@RequestParam String username, @RequestParam String password, ModelMap model) {
		
		if (username.equals("admin") && password.equals("password")) {
			validUser = true;
			
			model.put("sucessMessage", "Login successful!");

			return "welcome";
		}
		
		else {
			
			model.put("errorMessage", "Invalid credentials, please try again");
			return "login";
		}
		
	}
	
	
	@GetMapping("/welcome")
	public String welcome(ModelMap model) {
		
		if (validUser){
			return "welcome";
		}
		else {
			model.put("errorMessage", "Please validate credentials");
			return "login";
		}
	}
	
	@PostMapping("/welcome")
	public String route(@RequestParam String infoType, @RequestParam String schoolName, ModelMap model) {
		
		System.out.println("\nValidate: " + model.get("validate") + "\n");
		
		if (validUser) {

			// Get appropriate school name
			if (schoolName.equals("schs")) {
				model.put("schoolName", "Santa Cruz High School");
				schoolName = "Santa Cruz High School";
			} else {
				model.put("schoolName", "Harbor High School");
				schoolName = "Harbor High School";
			}

			// Route to appropriate jsp page
			try {
				if (infoType.equals("student")) {
					Student[] stuArr = exchangeService.getStudents(schoolName);
					model.addAttribute("stuArr", stuArr);
					return "studentinfo";

				} else if (infoType.equals("transportation")) {
					Transportation[] transArr = exchangeService.getTransportation(schoolName);
					model.put("transArr", transArr);
					return "transinfo";
				} else {
					FinanceData finData = exchangeService.getFinancial(schoolName);
					model.put("finData", finData);
					return "financeinfo";
				}
			} catch (Exception e) {
				return "errorpage";
			}

		}

		else {
			model.put("errorMessage", "Please validate credentials");
			return "login";
		}
		
	}
	
	@GetMapping("/logout")
	public String logout(ModelMap model) {
		validUser = false;
		model.put("successMessage", "Logout successful!");
		
		return "login";
	}
	
	
	
	
}
