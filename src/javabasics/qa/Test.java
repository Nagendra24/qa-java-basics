package javabasics.qa;

public class Test {

	
	public int testMet() {
		return 10;
	}
	
	public int testMet2() {
		return 1;
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.testMet());
	}
}
