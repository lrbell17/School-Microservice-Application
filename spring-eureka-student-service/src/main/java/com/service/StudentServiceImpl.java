package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.StudentDao;
import com.entity.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public void addStudent(Student stu) {
		studentDao.addStudent(stu);
	}

	@Override
	public List<Student> findAll() {
		
		return studentDao.findAll();
	}
}
