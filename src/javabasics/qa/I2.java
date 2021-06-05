package javabasics.qa;

public class I2 implements I1.I2{

	@Override
	public void met2() {
		// TODO Auto-generated method stub
	System.out.println("Here");	
	}
	
public static void main(String[] args) {
	I2 ii = new I2();
	ii.met2();
}
}
