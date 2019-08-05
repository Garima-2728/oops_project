package com.garima.feereport.dao.impl;

import java.util.Date;

import com.garima.feereport.bo.FeeReport;
import com.garima.feereport.dao.IStudentDao;
import com.garima.feereport.dao.IStudentStats;
import com.garima.feereport.dao.entity.StudentStats;

public class StudentStatsImpl implements IStudentStats  {
 
	@Override
	public FeeReport getFeeReport() {
		
		IStudentDao studdao = new StudentDaoImpl();
		StudentStats stats = new StudentStats();
		stats.setStudent(studdao.getStudent());
		stats.setAmount(4383);
		stats.setFeeStatus("paid");
		
		
		return null;
	}

}
