package javabasics.qa;

public class Abstraction2 {
	
	public static void main(String[] args) {
		
		
		VolumeTest vt = new baseOfCirlce();
		VolumeTest vt2 = new baseOfSquare();
		
		System.out.println(vt.calculateVolume(10, 10));
		System.out.println(vt2.calculateVolume(10, 10));
		
	}
}

abstract class VolumeTest {
	int calculateVolume(int length,int width) {
		int xx = volumeBase(length)*width;
		return xx;
	}
	abstract int volumeBase(int length);
	
	
}

class baseOfCirlce extends VolumeTest{

	int volumeBase(int length) {
		int length2=length*length;
		return length2;
	}
}

class baseOfSquare extends VolumeTest{
	int volumeBase(int length) {
		int length3=length/2 *length/2;
		return length3;
		// TODO Auto-generated method stub
	}
}