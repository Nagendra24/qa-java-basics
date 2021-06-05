package javabasics.qa;

abstract class AbstractClass {
	
	int length;
	int height;
	int volume_of_container(int length,int height) {
		this.length=length;
		this.height = height;
		
		int volume = areaOfBase(this.length)* this.height;
		return volume;
	}
	abstract int areaOfBase(int length);
	
}

class CalculateBaseOfCircle extends AbstractClass {
	
	int areaOfBase(int length) {
		int length2 = (length/2)*(length)/2;  
		return length;
	}
}

class CalculateBaseOfSquare extends AbstractClass  {
	
	int areaOfBase(int length) {
		int length3 = length;
		int val = length* length;
		return val;
	}
}

public class AbstractionUnderstanding{
	
	public static void main(String[] args) {
		AbstractClass calCircleBase = new CalculateBaseOfCircle();
		System.out.println(calCircleBase.volume_of_container(10, 10));
		
		AbstractClass calSquareBase = new CalculateBaseOfSquare();
		System.out.println(calSquareBase.volume_of_container(10,10));
	}
}

