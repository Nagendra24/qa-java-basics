package javabasics.qa;
public class ICICIBankLogic implements ICICIBankInterface {
	@Override
	public String withdrawAmount(int amount) {
		System.out.println("Welcome to ICICI your amount "+ amount+" is safe");
		return "Welcome to ICICI";
	}
}