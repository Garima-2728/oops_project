package com.garima.feereport.dao.entity;

import java.util.Date;

public class Student {
	private int studentId; 
	private String name;
	private String isActive;
	private Date dateOfBirth;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", isActive=" + isActive + ", dateOfBirth="
				+ dateOfBirth + "]";
	}
	
	
	

}
