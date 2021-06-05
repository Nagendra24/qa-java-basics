package com.sampleproject.students;

public class StudentPojo {
	
	private String name;
	private int rollno;
	private int percentage;
	
	public StudentPojo(String name,int rollno,int percentage) {
		this.name = name;
		this.rollno=rollno;
		this.percentage=percentage;
	}

	public String getName() {
		return name;
	}

	public int getRollno() {
		return rollno;
	}

	public int getPercentage() {
		return percentage;
	}
}
