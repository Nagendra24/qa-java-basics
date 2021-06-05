package co.nisum.selenium.webdriver.basic;

public class ObjectReference {
	
	String name;
	
	public ObjectReference(String someName){
		name= someName;
	}
	
	public static void main(String args[]) {
		
		ObjectReference r1 = new ObjectReference("Nagendra");
		ObjectReference r2 = r1;
		
		r1.name="Y";
				
		
		System.out.println(r1.name);
		System.out.println(r2.name);
		
		
	}

}
