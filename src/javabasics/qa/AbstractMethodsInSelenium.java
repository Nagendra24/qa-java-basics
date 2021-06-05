package javabasics.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractMethodsInSelenium {

	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				  "E:\\Nisum_softwares\\chromedriver.exe"); 
		 driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ear buds");
		 
		 driver.getCurrentUrl();
		 driver.getClass();
		 driver.getPageSource();
		 driver.getTitle();
		 driver.navigate();

	}
	 
	 	
}
