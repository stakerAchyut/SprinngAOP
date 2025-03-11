package com.akshat.model;

public class Student {

	int rollNo;
	String name;
	String department;
	
	public Student(int rollNo, String name, String department) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.department = department;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", department=" + department + "]";
	}

}
