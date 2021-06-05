package javabasics.qa;

public class ConstructorExample2{  
	
	public static void main(String args[]){  
		A a=new  A(10);  
	}
}  
class A{  
	
	int a;
	A()
	{
		System.out.println("hello a");
	}  
	A(int a)
	{  
		this();
		this.a = a;
		System.out.println(a);
		methodInA();
	}
	void methodInA(){
		System.out.println("method in A called");
	}
}   