package com.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Transportation;

@Repository
public interface TransportationRepo extends CrudRepository<Transportation, Integer>{

}
