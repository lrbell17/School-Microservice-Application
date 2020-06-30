package com.example.springeurekaclientstudentservice.domain;

public class Transportation {

	private String transType;
	private double price;
	
	public Transportation(String transType, double price) {
		super();
		this.transType = transType;
		this.price = price;
	}
	
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
