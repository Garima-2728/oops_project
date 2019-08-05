package com.garima.feereport.util;

import com.garima.feereport.bo.FeeReport;
import com.garima.feereport.dao.entity.Student;
import com.garima.feereport.dao.entity.StudentStats;

public class StudentBoEntityMapper {
	
	public static Student convertBoToEntity(com.garima.feereport.bo.Student student) {
		Student stdEntity = new Student(); 
		String name = stdEntity.getName(); 
		stdEntity.setName(name);
		return stdEntity;
		
	}
	
	public static com.garima.feereport.bo.Student convertEntityToBo (Student student) {
		com.garima.feereport.bo.Student stdbo = new com.garima.feereport.bo.Student();
		stdbo.setName(student.getName());
		return stdbo;
		
	}
	
	public static StudentStats convertBoToEntityStats(FeeReport feereport) {
		StudentStats statsEntity = new StudentStats();
		statsEntity.setAmount(feereport.getAmount());
		statsEntity.setFeeStatus(feereport.getStatus());
		statsEntity.setStudent(567);
		return statsEntity;
		
	}
	
	public static FeeReport convertEntityToBoStats(StudentStats stats) {
		FeeReport fee = new FeeReport();
		fee.setAmount(stats.getAmount());
		fee.setStatus(stats.getFeeStatus());
		return fee;
		
	}
	
}
