package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Student;


@Service
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private StudentRepo studentRepo;
	
	
	@Override
	public void addStudent(Student stu) {
		studentRepo.save(stu);
	}
	
	@Override
	public List<Student> findAll() {
		List<Student> list = new ArrayList<Student>();
		studentRepo.findAll().iterator().forEachRemaining(list::add);
		return list;
	}
}
