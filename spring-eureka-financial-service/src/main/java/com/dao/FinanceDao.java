package com.dao;

import java.util.List;

import com.entity.FinanceData;

public interface FinanceDao {
	
	public void addFinanceData(FinanceData financeData);
	
	public List<FinanceData> findAll();
	
	public FinanceData findBySchoolName(String schoolName);
}
