package co.nisum.selenium.webdriver.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConstructorStudentExample {

	private String name;
	private String subject;
	private int marks;
	private char grade;
	
	public ConstructorStudentExample() {
		System.out.println("Constructor called");
	}
	
	List studentList;
	
	public ConstructorStudentExample(String name,String subject,int marks,char grade) {
		studentList = Arrays.asList(this.name=name,
		this.subject=subject,
		this.marks = marks,
		this.grade = grade);
	}
	
	  public static List giveGrade(List listobj) 
	  { 
//		  System.out.println(listobj);
		  List aaa = Arrays.asList(listobj);
		  return aaa;
	  }
	 
	  
	
	public static void main(String[] args) {
		ConstructorStudentExample[] cse = new ConstructorStudentExample[10];
//		ConstructorStudentExample cse2 = new ConstructorStudentExample("Nagendra", "Maths", 90, 'A');
		
		for(int i=0;i<10;i++) {
		cse[i] = new ConstructorStudentExample("Nagendra","Maths", 90, 'A');	
		}
		
//		System.out.println();
	}
}