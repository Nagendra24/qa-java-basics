package javabasics.qa;

public class NestedClass {
	
	interface iExample{
		public void test();
	}
	void methodA() {
		System.out.println("MetA");
	}
	
	static void staticMethod() {
		System.out.println("static method");
	}
	class InnerClass implements iExample{
		
		void methodB() {
			System.out.println("MetB");
		}

		@Override
		public void test() {
			// TODO Auto-generated method stub
			
		}
	}

	public static void main(String[] args) {
		NestedClass nc = new NestedClass();
		NestedClass.InnerClass inc = nc.new InnerClass();
		inc.methodB();
		staticMethod();
		SetExample.stExam();
		
		NestedClass.iExample ieee = nc.new InnerClass();
		ieee.test();
	}
}
