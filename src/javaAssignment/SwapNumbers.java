package javaAssignment;

/*4. Provide the output for the below program and provide the explanation.
public static void main(String[] args) {
   int x=9,y=11;
   magic(x,y);
   System.out.println(x+" "+y);
}

static void magic(int a, int b) {
   int temp=a;
   a=b;
   b=temp;
}*/


public class SwapNumbers {
	
	public static void main(String[] args) 
		{
		  int x=9,y=11;
		  magic(x,y);
		}

		static void magic(int a, int b) 
		{
		   int temp=a;
		   a=b;
		   b=temp;
		   System.out.println(a+" "+b);
		}
}