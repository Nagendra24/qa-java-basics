package co.nisum.selenium.webdriver.basic;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day1 {
	
	WebDriver driver;
	
	
	public void invokeBrowser() {
		try {
			
			  System.setProperty("webdriver.chrome.driver",
			  "E:\\Nisum_softwares\\chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.manage().deleteAllCookies(); driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			  driver.get("https://www.amazon.in/");
			 
			 	 
			searchAmazon();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void searchAmazon() throws InterruptedException, IOException, ParseException {
		
		
		
		  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ear buds");
		  Thread.sleep(3000);
		  driver.findElement(By.id("nav-search-submit-button")).click();
		 
		  JSONParser parser = new JSONParser();
		try(FileReader reader = new FileReader("E:\\Nisum-Training\\selenium\\SeleniumTest\\products.json"))
		{
			JSONObject obj = (JSONObject) parser.parse(reader);
			
			for(Object keys:obj.keySet()) {
				Object val = obj.get(keys);
				
				System.out.println(val);
				
				JSONObject obj2 = (JSONObject) val;
				
				
				  for(Object key2: obj2.keySet()) 
				  { 
					  String val2 = (String) obj2.get(key2);
					  
				  WebElement body = driver.findElement(By.tagName("body")); String bodyText =
				  body.getText();
				  
				  System.out.println(val2); if(bodyText.contains(val2)) {
				  System.out.println(val2+ "   exists"); } }
				 
			}
		}
	}
	
	public static void main(String[] args) {
		
		Day1 d1 = new Day1();
		d1.invokeBrowser();
		
		// TODO Auto-generated method stub

	}

}
