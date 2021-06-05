package com.nisum.employees;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String deptName;
	private double budget;
//	private Employee[] emp = new Employee[5];
	
	private List<Employee> empList = new ArrayList<Employee>();
//	private int counter=0;
	
	public Department(String deptName) {
		this.deptName = deptName;
		this.budget=50000;
	}
	
	public void addEmployee(Employee empObj) {
//		emp[counter] = empObj;
		empList.add(empObj);
		
		if(empObj.getGrade()>=5) {
			this.budget+= 150000;
		}
		else {
			this.budget+=100000;
		}
	}
	
	public void describe() {
		String temp = "DeptName "+this.deptName + "\nBudget "+this.budget + "\nEmployees: " ;
		
		
		  for(Employee x:empList) 
		  { 
			  if(x != null)
			  {
				  temp += x.getEmplInfo() + " "; 
		      }
	      }
		 
		
		System.out.println(temp);
	}
	
}
