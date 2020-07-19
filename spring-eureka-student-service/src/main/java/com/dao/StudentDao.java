package com.dao;

import java.util.List;

import com.entity.Student;

public interface StudentDao {
	
	public void addStudent(Student stu);
	
	public List<Student> findAll();
}
