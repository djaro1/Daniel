package com.hibernate;

public class Student {
private int sid;
private String sname;
private String city;
private String status;
private int totalfee;

Student (){
}


public Student(String sname, String city, String status, int totalfee) {
	
	this.sname = sname;
	this.city = city;
	this.status = status;
	this.totalfee = totalfee;
}


public int getSid() {
	return sid;
}


public void setSid(int sid) {
	this.sid = sid;
}


public String getSname() {
	return sname;
}


public void setSname(String sname) {
	this.sname = sname;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public String getStatus() {
	return status;
}


public void setStatus(String status) {
	this.status = status;
}


public int getTotalfee() {
	return totalfee;
}


public void setTotalfee(int totalfee) {
	this.totalfee = totalfee;
}


@Override
public String toString() {
	
	return sid + "\t" +sname + "\t" + city + "\t" + status + "\t + totalfee";
}



}
