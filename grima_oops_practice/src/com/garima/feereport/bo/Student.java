package com.garima.feereport.bo;

import java.util.Date;

public class Student {
	private int rollNumber;
	private String name;
	private Date dateOfBirth;
	public int getRollNumber() {
		return rollNumber;
	} 
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	

}
