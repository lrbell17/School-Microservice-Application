package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.FinanceData;


@Service
public class FinanceDaoImpl implements FinanceDao {

	@Autowired
	private FinanceRepo financeRepo;
	
	
	@Override
	public void addFinanceData(FinanceData financeData) {
		financeRepo.save(financeData);
	}
	
	@Override
	public List<FinanceData> findAll() {
		List<FinanceData> list = new ArrayList<FinanceData>();
		financeRepo.findAll().iterator().forEachRemaining(list::add);
		return list;
	}
	
	@Override
	public FinanceData findBySchoolName(String schoolName) {
	
		return financeRepo.findBySchoolName(schoolName);
	}
}
