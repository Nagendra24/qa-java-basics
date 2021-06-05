package com.sampleproject.students;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	public static void main(String[] args) {
		StudentPojo sp = new StudentPojo("Nagendra", 24, 90);
		StudentPojo sp1 = new StudentPojo("Uday", 14, 99);
		StudentPojo sp2 = new StudentPojo("Chanti", 26, 88);
		StudentPojo sp3 = new StudentPojo("Adi", 25, 9);
		
		List<StudentPojo> studpojo = new ArrayList<StudentPojo>();
//		studpojo.add(sp);
		
		studpojo.add(sp);
		studpojo.add(sp1);
		studpojo.add(sp2);
		studpojo.add(sp3);
		
		
		int perr = 1;
		int highestt=0;
		for(StudentPojo ssss: studpojo) {
			if(ssss.getPercentage()>perr) {
				highestt = ssss.getPercentage();
				perr=ssss.getPercentage();
			}
		}
		System.out.println(highestt);
		
	}
}
