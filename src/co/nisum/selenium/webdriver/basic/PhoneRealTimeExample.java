package co.nisum.selenium.webdriver.basic;

public class PhoneRealTimeExample {
	
	private float width=6.98f;
	private float height = 13.6f;
	private String osName="Android";
	private String brand="Samsung";
	private int price=100;
	
	
	private void call() {
		System.out.println("You can make call");
	}
	private void sendMessage() {
		System.out.println("You can send a message");
	}
		private void browse() {
			System.out.println("You may browse");
		}
		
		
		public static void main(String[] args) {
			PhoneRealTimeExample pr = new PhoneRealTimeExample();
			System.out.println(pr.brand);
			System.out.println(pr.height);
			System.out.println(pr.width);
			System.out.println(pr.osName);
			
			pr.browse();
			pr.call();
			pr.sendMessage();
		}
		
		
	}
