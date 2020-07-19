package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Transportation;


@Service
public class TransDaoImpl implements TransDao {

	@Autowired
	private TransportationRepo transRepo;
	
	
	@Override
	public void addTransportation(Transportation trans) {
		transRepo.save(trans);
	}
	
	@Override
	public List<Transportation> findAll() {
		List<Transportation> list = new ArrayList<Transportation>();
		transRepo.findAll().iterator().forEachRemaining(list::add);
		return list;
	}
}
