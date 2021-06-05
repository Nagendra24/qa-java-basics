package javabasics.qa;

class AB{
	public void methodA() {
		System.out.println("method A from class A");
	}
	
	public void methodA(int a) {
		System.out.println("methodA from class A with param"+ a);
	}
}

class B extends AB{
	public void methodB() {
		System.out.println("methodB from class B");
	}
	
}

class C extends B{
	public void methodC() {
		System.out.println("method C from class C");
	}
	public void methodA() {
		System.out.println("methodA from class C");
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		C c = new C();
		c.methodA();
		c.methodB();
		c.methodC();
		c.methodA(10);
		c.methodA();	
	}
}
