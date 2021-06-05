package com.nisum.employees;

public class Employee {
	private String empName;
	private int grade;
	
	Employee(String empName,int grade){
		this.empName = empName;
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}
	
	public String getEmplInfo() {
		return empName + "( " + grade + " )"; 
	}

}
