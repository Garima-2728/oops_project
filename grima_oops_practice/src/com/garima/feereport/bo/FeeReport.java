package com.garima.feereport.bo;

import java.util.Date;

public class FeeReport {
	private Student student;
	private String status;
	private String standard;
	private Date paidDate;
	private long amount;
	
		 
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public String getStandard() {
		return standard;
	}


	public void setStandard(String standard) {
		this.standard = standard;
	}


	public Date getPaidDate() {
		return paidDate;
	}


	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}


	public long getAmount() {
		return amount;
	}


	public void setAmount(long amount) {
		this.amount = amount;
	}



	@Override
	public String toString() {
		return "FeeReport [student=" + student + ", status=" + status + ", standard=" + standard + ", paidDate="
				+ paidDate + ", amount=" + amount + "]";
	}
	
	
}
