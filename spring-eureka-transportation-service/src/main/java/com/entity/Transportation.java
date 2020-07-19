package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "MICROSERVICE_TRANS_DATA")
public class Transportation {
	
	// Columns 
	@Id
	@GeneratedValue
	private int transId;
	@Column
	private String schoolName;
	@Column
	private String transType;
	@Column
	private double transCost;
	
	
	// Constructor
	public Transportation() {}

	public Transportation(String schoolName, String transType, double transCost) {
		super();
		this.schoolName = schoolName;
		this.transType = transType;
		this.transCost = transCost;
	}

	//  Getters and Setters
	public int getTransId() {
		return transId;
	}

	public void setTransId(int transId) {
		this.transId = transId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public double getTransCost() {
		return transCost;
	}

	public void setTransCost(double transCost) {
		this.transCost = transCost;
	}


}
