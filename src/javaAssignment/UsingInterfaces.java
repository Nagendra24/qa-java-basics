package javaAssignment;

/*3. Using below two interfaces, write a program to get output as : 
Nisum
Technologies!

Interfaces:
interface technology {
   
}

interface nisum {
   static void print() {
       System.out.print("Technologies!");
   }
}*/

interface technology{
	static void print() {
		System.out.println("Nisum");
	};
}

interface nisum{
	static void print() {
		System.out.println("Technologies");
	}
}

public class UsingInterfaces implements technology,nisum{
	
	public static void main(String[] args) {
		technology.print();
		nisum.print();
	}
}
