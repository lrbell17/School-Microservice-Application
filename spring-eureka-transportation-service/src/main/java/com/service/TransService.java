package com.service;

import java.util.List;

import com.entity.Transportation;

public interface TransService {
	
	public void addTrans(Transportation trans);
	
	public List<Transportation> findAll();
}
