package javabasics.qa;

public class HDFCBankLogic implements HDFCBankInterface,Bank {

	int amount;
	
	@Override
	public int withdrawAmount(int amount) {
		if (amount <= 0) {
			System.out.println("Amount should be greater than 0--HDFC");
		}
		else {
			System.out.println("Amount is valid HDFC");
		}
		return amount;
	}
	
	@Override
	public void rateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println("10% interest");
	}
}
