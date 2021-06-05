package co.nisum.selenium.webdriver.basic;

public class PrimitiveVariable {

	public static void main(String args[]) {
		
	int a = 1;
	int b = a;
	
	System.out.println("Value of a  : " +a);
	System.out.println("Value of b  : " +b);
	
	a = 100;
	
	System.out.println("Value of a after reinitializing  : " +a);
	System.out.println("Value of b after a change : " +b);
	}
	
}
