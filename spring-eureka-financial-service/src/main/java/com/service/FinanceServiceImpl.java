package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.FinanceDao;
import com.entity.FinanceData;

@Service
@Transactional
public class FinanceServiceImpl implements FinanceService {

	@Autowired
	private FinanceDao financeDao;
	
	@Override
	public void addFinanceData(FinanceData financeData) {
		financeDao.addFinanceData(financeData);
	}

	@Override
	public List<FinanceData> findAll() {
		
		return financeDao.findAll();
	}
	
	@Override
	public FinanceData findBySchoolName(String schoolName) {
	
		return financeDao.findBySchoolName(schoolName);
	}
}
