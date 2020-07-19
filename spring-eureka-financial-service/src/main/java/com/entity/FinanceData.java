package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "MICROSERVICE_FINANCIAL_DATA")
public class FinanceData {
	
	// Columns 
	@Id
	@GeneratedValue
	private int schoolId;
	@Column(unique = true)
	private String schoolName;
	@Column
	private double tuition;
	@Column
	private double schoolLunches;
	@Column 
	private boolean scholarships;
	
	// Constructor
	public FinanceData() {}

	public FinanceData(String schoolName, double tuition, double schoolLunches, boolean scholarships) {
		super();
		this.schoolName = schoolName;
		this.tuition = tuition;
		this.schoolLunches = schoolLunches;
		this.scholarships = scholarships;
	}

	// Getters and Setters
	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public double getTuition() {
		return tuition;
	}

	public void setTuition(double tuition) {
		this.tuition = tuition;
	}

	public double getSchoolLunches() {
		return schoolLunches;
	}

	public void setSchoolLunches(double schoolLunches) {
		this.schoolLunches = schoolLunches;
	}

	public boolean isScholarships() {
		return scholarships;
	}

	public void setScholarships(boolean scholarships) {
		this.scholarships = scholarships;
	}

	
}
