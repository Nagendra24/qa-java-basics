package co.nisum.selenium.webdriver.basic;


class Developer{
	int score = 91;
	public void action() {
		System.out.println("Developer score: "+ score);	
	}
}

class Tester{
	String company = "Nisum";
	String company2 = company;
	int score = 92;
	public void action() {
		System.out.println("Tester "+ score);	
	}

	String testerName1;
	Tester(String company){
		testerName1=company;
	}
}

class Finance{
	int score=93;
	public void action() {
		System.out.println("Finance "+ score);	
	}
}

public class Organization{

	public static void main(String args[]) {
		Developer d = new Developer(); d.action();
		Tester t = new Tester("Nagendra");
		Tester t2 = t;
		System.out.println(t.testerName1);
		System.out.println(t2.testerName1);
		t.action();
		t2.testerName1="T3";
		System.out.println(t.testerName1);
		System.out.println(t2.testerName1);
		System.out.println(t.company);
		System.out.println(t.company2);
		t.company="Nisum Hyderabad";
		System.out.println(t.company);
		System.out.println(t.company2);

		Finance f = new Finance(); 
		f.action();


	}
}