package co.nisum.selenium.webdriver.basic;

public class PencilExampleRealWorld {
	
	private String name="Apsara";
	private String color="black";
	
	public void action() {
		System.out.println("We can write using pencil");
	}
	
	public static void main(String[] args) {
		PencilExampleRealWorld pe = new PencilExampleRealWorld();
		System.out.println(pe.name);
		System.out.println(pe.color);
	}

}
