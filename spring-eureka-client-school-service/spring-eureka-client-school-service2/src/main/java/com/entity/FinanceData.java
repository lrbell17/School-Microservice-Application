package com.entity;

public class FinanceData {

	private int schoolId;
	private String schoolName;
	private double tuition;
	private double schoolLunches;
	private boolean scholarships;
	
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
