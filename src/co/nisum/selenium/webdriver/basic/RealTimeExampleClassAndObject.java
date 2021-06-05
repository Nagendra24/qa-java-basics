package co.nisum.selenium.webdriver.basic;

public class RealTimeExampleClassAndObject {
	
	// field of class
	  int gear = 5;

	  // method of class
	  void braking() {
	    System.out.println("Breaking");
	  }
	  
	  public static void main(String[] args) {
			// create object
		  RealTimeExampleClassAndObject sportsBicycle = new RealTimeExampleClassAndObject();

			// access field and method
			System.out.println(sportsBicycle.gear);
			sportsBicycle.braking();

	}
	}
