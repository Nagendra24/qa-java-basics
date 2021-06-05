package javabasics.qa;

public class ConstructorWithThis {
	
	int number1;
	int number2;
	
	public ConstructorWithThis(int number1,int number2) {
		this.number1 = number1;
		this.number2 = number2;
		int sum = this.number1+this.number2;
		System.out.println("Addition :  "+sum);
		}
	
	public void ConstructorWithThis(int someNum) {
		number1 = someNum;
		System.out.println("Constructor without using this keyword: "+ number1);
	}
	
	public static void main(String[] args) {
		ConstructorWithThis csw = new ConstructorWithThis(10,20);
		csw.ConstructorWithThis(100);
	}
}
