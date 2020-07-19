package com.dao;

import java.util.List;

import com.entity.Transportation;

public interface TransDao {
	
	public void addTransportation(Transportation trans);
	
	public List<Transportation> findAll();
}
