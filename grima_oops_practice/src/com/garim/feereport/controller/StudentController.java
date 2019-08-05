package com.garim.feereport.controller;

import com.garima.feereport.bo.Student;
import com.garima.feereport.service.IStudentService;
import com.garima.feereport.service.impl.IStudentServiceImpl;

public class StudentController {
	
	public Student getStudent() {
		IStudentService stud = new IStudentServiceImpl();
		Student student = stud.getStudent(2001);
		System.out.println(student);
		return student; 
	}
	
	public static void main(String[] args) {
		StudentController controller = new StudentController();
		controller.getStudent();
		
	}

} 
