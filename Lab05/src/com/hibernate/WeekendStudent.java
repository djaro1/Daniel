package com.hibernate;

public class WeekendStudent extends CurrentStudent {
	
	private String wcompany;
	private String wcemail;
	private int wctc;
	
	public WeekendStudent() {	}

	public WeekendStudent(String sname, String city, String status, int totalfee,int feebal,String timings,String branch, String wcompany, String wcemail,
			int wctc) {
		super(sname, city, status, totalfee,feebal,timings,branch);
		this.wcompany = wcompany;
		this.wcemail = wcemail;
		this.wctc = wctc;
	}

	
	public String getWcompany() {
		return wcompany;
	}

	public void setWcompany(String wcompany) {
		this.wcompany = wcompany;
	}

	public String getWcemail() {
		return wcemail;
	}

	public void setWcemail(String wcemail) {
		this.wcemail = wcemail;
	}

	public int getWctc() {
		return wctc;
	}

	public void setWctc(int wctc) {
		this.wctc = wctc;
	}

	@Override
	public String toString() {
		return "WeekendStudent [wcompany=" + wcompany + ", wcemail=" + wcemail + ", wctc=" + wctc + "]";
	}

	
}
