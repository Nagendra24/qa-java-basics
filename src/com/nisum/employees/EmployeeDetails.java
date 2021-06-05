package com.nisum.employees;

public class EmployeeDetails{
	
	public static void main(String[] args) {
		Employee nag = new Employee("Nagendra",6);
		Employee muq = new Employee("Muqtadar", 6);
		Employee uday = new Employee("Uday",9);
		Employee bharat = new Employee("Bharat", 7);
		Employee james = new Employee("james",4);
		
		Department it = new Department("IT");
		Department sales = new Department("Sales");
		
		it.addEmployee(nag);
		it.addEmployee(muq);
		it.addEmployee(uday);
		
		sales.addEmployee(bharat);
		sales.addEmployee(james);
		
		it.describe();
		System.out.println("===========================");
		sales.describe();
		
		
	}
	
}