package com.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Student;
import com.service.StudentService;

@RestController
public class StudentServiceController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/addstudents")
	public String addStudents() {
		Student s1 = new Student("Harbor High School", "Jaxon Bruce", "class 4", 2013, 3.6);
		Student s2 = new Student("Harbor High School","Annabell O'Neil;", "class 6", 2018, 2.7);
		Student s3 = new Student("Harbor High School", "Jasper Villa", "class 1", 2011, 3.8);
		Student s4 = new Student("Harbor High School","Zander Preece", "class 7", 2014, 2.5);
		
		Student s5 = new Student("Santa Cruz High School", "Lauren Nixon", "morning class", 2014, 3.9);
		Student s6 = new Student("Santa Cruz High School", "Darrell Cabrera", "afternoon class", 2016, 3.4);
		Student s7 = new Student("Santa Cruz High School", "Aneeka Laing", "morning class", 2019, 2.9);
		Student s8 = new Student("Santa Cruz High School", "Jimi Marshall", "afternoon class", 2020, 3.7);
		
		studentService.addStudent(s1);
		studentService.addStudent(s2);
		studentService.addStudent(s3);
		studentService.addStudent(s4);
		studentService.addStudent(s5);
		studentService.addStudent(s6);
		studentService.addStudent(s7);
		studentService.addStudent(s8);
		
		return "Students added";
	}

	@GetMapping("/getstudentdetails/{schoolname}")
	public List<Student> getStudents(@PathVariable String schoolname) {
		
		List<Student> refinedList = new ArrayList<Student>();
		List<Student> studentList = studentService.findAll();

		// adding vals that match school name
		for (Student s : studentList) {
			if (s.getSchoolName().equalsIgnoreCase(schoolname)) {
				refinedList.add(s);
			}
		}
		
		if (refinedList.isEmpty()) {
			Student std = new Student("Not Found", "N/A", "N/A", 0, 0.0);
			refinedList.add(std);
		}
		
		return refinedList;
	}
}
