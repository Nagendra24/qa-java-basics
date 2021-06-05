package co.nisum.selenium.webdriver.basic;

public class NisumPhone implements FeaturePhone,SmartPhoneInterface{

	@Override
	public void touchScreen() {
		// TODO Auto-generated method stub
		System.out.println("touch screen");
	}

	@Override
	public void camera() {
		System.out.println("camera");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void internet() {
		// TODO Auto-generated method stub
		System.out.println("Internet");
	}

	@Override
	public void bluetooth() {
		// TODO Auto-generated method stub
	System.out.println("bluetooth");	
	}

	@Override
	public void media() {
		// TODO Auto-generated method stub
	System.out.println("Media");	
	}

	@Override
	public void dialer() {
		// TODO Auto-generated method stub
		System.out.println("dialer");
	}

	@Override
	public void contacts() {
		// TODO Auto-generated method stub
		
		System.out.println("contacts");
	}

	@Override
	public void fmRadio() {
		// TODO Auto-generated method stub
		System.out.println("fmradio");
	}

	@Override
	public void calculator() {
		// TODO Auto-generated method stub
		System.out.println("calculator");
	}

	
}
