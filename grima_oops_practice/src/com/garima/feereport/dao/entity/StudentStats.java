package com.garima.feereport.dao.entity;

public class StudentStats {
	
	private Student student;
    private String feeStatus;
	private long amount;
	
	 
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getFeeStatus() {
		return feeStatus;
	}
	public void setFeeStatus(String feeStatus) {
		this.feeStatus = feeStatus;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "StudentStats [student=" + student + ", feeStatus=" + feeStatus + ", amount=" + amount + "]";
	}
	
	
	
	

}
