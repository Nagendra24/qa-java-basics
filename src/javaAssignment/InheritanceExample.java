package javaAssignment;

//5. Write the programs by referring to the following diagram. (Inheritance example).

class Circle{
	double radius = 1.0;
	String color = "red";
	
	Circle(){
		System.out.println("Circle Constructor is called");
	}
	Circle(double radius){
		System.out.println("Circle Constructor with one parameter is called "+"radius is "+ radius);
	}
	Circle(double radius,String color){
		System.out.println("Circle Constructor with two parameter is called"+"radius is "+radius+"color is "+color);
	}
	
	double getArea() {
		return radius;
	}
	
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}	
}

class Cylinder extends Circle{
	
	double height= 1.0;
	
	
	Cylinder(){
		System.out.println("Cylinder constructor is called");
	}
	Cylinder(double height){
		System.out.println("Cylinder constructor with one parameter is called "+"height is "+height);
	}
	Cylinder(double height,double radius){
		System.out.println("Cylinder constructor with two parameters is called "+"height is "+height+"radius is "+ radius+"getArea : "+getArea()*3);
	}
	Cylinder(double height,double radius,String color){
		System.out.println("Cylinder constructor with three parameters is called "+"height is "+height+"radius is "+radius+"color is "+color);
	}
	
	double getVolume() {
		return height;
	}
	
	
	@Override
	public String toString() {
		return "Cylinder [height=" + height + "]";
	}	
}

public class InheritanceExample {
	public static void main(String[] args) {
		Circle ci = new Circle();
		ci = new Circle(0.1);
		ci = new Circle(0.2,"green");
		
		Cylinder cy = new Cylinder();
		cy = new Cylinder(2.1);
		cy = new Cylinder(3.1,4.1);
		cy = new Cylinder(4.1,5.1,"blue");
		
		
		System.out.println("========================");
		System.out.println(ci);
		System.out.println("========================");
		System.out.println(cy);
	}
}