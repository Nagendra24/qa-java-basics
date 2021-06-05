package co.nisum.selenium.webdriver.basic;

public class ConstructorExample {
	
	ConstructorExample(){
		System.out.println("no paramters");
	}

	ConstructorExample(int x,String y){
		System.out.println("x is "+ x +" y is "+y);
	}
	
	public static void main(String[] args) {
		ConstructorExample ce = new ConstructorExample();
		ConstructorExample ce2 = new ConstructorExample(10,"Hi");
	}
}
