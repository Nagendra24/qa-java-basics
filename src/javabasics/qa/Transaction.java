package javabasics.qa;

public class Transaction 
{
	int amount = 0;
    public int withdrawAmount(int amount) {
	if (amount <= 0) {
		System.out.println("Amount should be greater than 0");
	}
	else {
		System.out.println("Amount is valid");
	}
	return amount;
}
}
