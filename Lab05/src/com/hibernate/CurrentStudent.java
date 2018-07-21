package com.hibernate;

public class CurrentStudent extends Student {
	private int feebal;
	private String timings;
	private String branch;
	
	public CurrentStudent() {	}
	@Override
	public String toString() {
		
		return super.toString() + "\t" + feebal + "\t" + timings + "\t" + branch;
	}

	public CurrentStudent(String sname,String city,String status,int totalfee,int feebal, String timings, String batch) {
		super(sname,city,status,totalfee);
		this.feebal = feebal;
		this.timings = timings;
		this.branch = batch;
	}

	public int getFeebal() {
		return feebal;
	}



	public void setFeebal(int feebal) {
		this.feebal = feebal;
	}



	public String getTimings() {
		return timings;
	}



	public void setTimings(String timings) {
		this.timings = timings;
	}



	public String getBranch() {
		return branch;
	}



	public void setBranch(String branch) {
		this.branch = branch;
	}
	

}
