package javabasics.qa;

public class StaticExample {

	
	//Use static methods for conditions where the result doesn't change. This cannot be instantiated.
	public static void mphToKmp(int number) {
		System.out.println(number*number);
	}
	
	public static void main(String[] args) {
		mphToKmp(10);
		
	}
	
	public static void mphToKmp() {
		System.out.println("ds");
	}
	
	public final void test() {
		System.out.println("test");
	}
	
	public final void test(int n) {
		System.out.println("test2");
	}
}

class Ex extends StaticExample{
	
	
	public void aa() {
		System.out.println("aa");
	}
	public static void main(String[] args) {
		StaticExample se = new StaticExample();
		se.test();
		StaticExample.mphToKmp();
	}
}