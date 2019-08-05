package com.garima.feereport.service.impl;

import java.util.Date;

import com.garima.feereport.bo.FeeReport;
import com.garima.feereport.bo.Student;
import com.garima.feereport.dao.IStudentDao;
import com.garima.feereport.dao.IStudentStats;
import com.garima.feereport.dao.impl.StudentDaoImpl;
import com.garima.feereport.dao.impl.StudentStatsImpl;
import com.garima.feereport.service.IStudentService;
import com.garima.feereport.util.StudentBoEntityMapper;

public class IStudentServiceImpl implements IStudentService {

	@Override
	public Student getStudent(int id) {
		
		IStudentDao studentdao = new StudentDaoImpl();
		return StudentBoEntityMapper.convertEntityToBo(studentdao.getStudent());
		
		
		 
	}

	@Override
	public FeeReport getFeeReport(Student student) {
		
		IStudentStats studstats = new StudentStatsImpl();
		IStudentServiceImpl studservice = new IStudentServiceImpl();
		return StudentBoEntityMapper.convertEntityToBo(studservice.getStudent(2));
		return null;
	}

}
