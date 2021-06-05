package co.nisum.selenium.webdriver.basic;

public class DataTypes {
	 public static void main(String[] args) {
	    	
		    boolean flag = true;
		    System.out.println(flag);    // prints true
		    
//		    The byte data type can have values from -128 to 127..
		    byte range;
		    range = 124;
		    System.out.println(range); 
		    
//		    range -32768 to 3276
		    short temperature;
		    temperature = -200;
		    System.out.println(temperature); 
		    
//		    The int data type can have values from -231 to 231-1 (32-bit signed two's complement integer).
		    int intRange = -4250000;
		    System.out.println(intRange);
		    
//		    263 to 263-1 (64-bit signed two's complement integer).
		    long longRange = -42332200000L;
		    System.out.println(longRange);
		    
//		    double precision(64-bit)
		    double number = -42.3;
		    System.out.println(number);
		    
		    
//			The float data type is a single-precision 32-bit floating-point
			float floatNumber = -42.3f;
		    System.out.println(floatNumber);
		    
//		    char type is a 16-bit Unicode character.(min-\u0000',max-\uffff)
		    char letter = '\u0051';
		    System.out.println(letter);
		    char letter2 = 65;
		    System.out.println(letter2);  
		    
		    String myString = "Java Programming";
		    System.out.println(myString);
		  }


	    
	    
	 
}
