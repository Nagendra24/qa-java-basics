package javabasics.qa;

interface Bank {

	public void rateOfInterest();
}

class BankLogic implements Bank{

	@Override
	public void rateOfInterest() {
		System.out.println("10% interest");
	}
	
	
}