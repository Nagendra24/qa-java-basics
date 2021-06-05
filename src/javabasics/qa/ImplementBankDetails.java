package javabasics.qa;
public class ImplementBankDetails{
	public static void main(String[] args) {
		HDFCBankInterface hdfcTrans = new HDFCBankLogic();
		Bank bankInterface = new HDFCBankLogic();
		hdfcTrans.withdrawAmount(20);
		bankInterface.rateOfInterest();
		
		ICICIBankInterface iciciTrans = new ICICIBankLogic();
		iciciTrans.withdrawAmount(20);
	}
}