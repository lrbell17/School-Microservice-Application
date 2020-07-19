package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.TransDao;
import com.entity.Transportation;

@Service
@Transactional
public class TransServiceImpl implements TransService {

	@Autowired
	private TransDao transDao;
	
	@Override
	public void addTrans(Transportation trans) {
		transDao.addTransportation(trans);
	}

	@Override
	public List<Transportation> findAll() {
		
		return transDao.findAll();
	}
}
