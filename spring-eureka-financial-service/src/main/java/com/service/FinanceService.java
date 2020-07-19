package com.service;

import java.util.List;

import com.entity.FinanceData;

public interface FinanceService {
	
	public void addFinanceData(FinanceData financeData);
	
	public List<FinanceData> findAll();
	
	FinanceData findBySchoolName(String schoolName);
}
