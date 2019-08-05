package com.garima.feereport.service;

import com.garima.feereport.bo.Student;

public interface IStudentService {
	public com.garima.feereport.bo.Student getStudent(int id);
	public com.garima.feereport.bo.FeeReport getFeeReport(Student student);
	
 
}
