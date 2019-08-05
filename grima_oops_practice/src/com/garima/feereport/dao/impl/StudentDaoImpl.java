package com.garima.feereport.dao.impl;

import java.util.Date;

import com.garima.feereport.dao.IStudentDao;
import com.garima.feereport.dao.entity.Student;

public class StudentDaoImpl implements IStudentDao {
	
	 

	@Override
	public Student getStudent() {
		Student student=new Student();
		student.setStudentId(2001);
		student.setName("Garima");
		student.setDateOfBirth(new Date());
		student.setIsActive("active");
		return student;
		
	}

	@Override
	public Student saveStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateStudent() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	 

}
