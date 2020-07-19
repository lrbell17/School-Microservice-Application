package com.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.FinanceData;

@Repository
public interface FinanceRepo extends CrudRepository<FinanceData, Integer>{

	public FinanceData findBySchoolName(String schoolName);
}
