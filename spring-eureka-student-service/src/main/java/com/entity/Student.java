package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "MICROSERVICE_STUDENT_DATA")
public class Student {
	
	// Columns 
	@Id
	@GeneratedValue
	private int studentId;
	@Column
	private String schoolName;
	@Column
	private String name;
	@Column
	private String className;
	@Column 
	private int gradYear;
	@Column 
	private double gpa;	
	
	// Constructor
	public Student() {}

	public Student(String schoolName, String name, String className, int gradYear, double gpa) {
		super();
		this.schoolName = schoolName;
		this.name = name;
		this.className = className;
		this.gradYear = gradYear;
		this.gpa = gpa;
	}

	// Getters / Setters
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getGradYear() {
		return gradYear;
	}

	public void setGradYear(int gradYear) {
		this.gradYear = gradYear;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	


}
