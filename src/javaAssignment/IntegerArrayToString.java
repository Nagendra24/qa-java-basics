package javaAssignment;

/*2. Write a program using the below array integer to get the output as 16642
Expression: int array[] = {1, 6, 6, 4, 2};
*/

public class IntegerArrayToString {
	
	public static void main(String[] args) {
		int[] intArray = {1,6,6,4,2};
		String x="";
		for(int i=0;i<intArray.length;i++) {  
			x=x+intArray[i];
		}
		System.out.println(x);
	}
}
