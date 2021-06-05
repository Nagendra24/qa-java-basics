package javabasics.qa;

//Java program to demonstrate a Set

import java.util.*;
public class SetExample {
	
	static void stExam() {
		System.out.println("static method from another class");
	}
	public static void main(String[] args)
	{
		// Set demonstration using HashSet
		Set hash_Set = new HashSet();

		hash_Set.add("Geeks");
		hash_Set.add("For");
		hash_Set.add("Geeks");
		hash_Set.add("Example");
		hash_Set.add("Set");

		System.out.println(hash_Set);
		Iterator it = hash_Set.iterator();
		System.out.println(it);
		
		  List<Integer> list = Arrays.asList(1,2,3,4,5,6);
	      //Scenario 1
	      Set<Integer> set1 = new HashSet<Integer>(list);
	      System.out.println(set1);
		
		/*
		 * for(int i=0;i<hash_Set.size();i++) { }
		 */
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		/*
		 * while(it.hasNext()) { String entry = (String) it.next(); System.out.println(
		 * entry); // System.out.println( entry.getValue()); }
		 */
		
	}
}
