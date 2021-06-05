package javaAssignment;

interface Shape {
	double getArea();
}

class Rectangle implements Shape {
	double length;
	double width;
	@Override
	public double getArea() {
		return 10;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	public double getVolume() {
		return getArea() * 20;
	}
}

class Triangle implements Shape {
	double base;
	double height;
	@Override
	public double getArea() {
		return 20;
	}
	public double getVolume() {
		return getArea() * 30;
	}
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}
}

public class InterfaceCheckingDiagram {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		System.out.println("Volume of shape for rectangle is " + r.getVolume());
		System.out.println("Volume of shape is triangle is " + t.getVolume());
	}
}
