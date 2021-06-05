package co.nisum.selenium.webdriver.basic;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tt {
	static WebDriver driver;
	
	
public static void searchAmazon() throws InterruptedException, IOException, ParseException {
		  
	try {
		  System.setProperty("webdriver.chrome.driver",
		  "E:\\Nisum_softwares\\chromedriver.exe"); 
		  driver = new ChromeDriver();
		  driver.manage().deleteAllCookies(); driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		  driver.get("https://www.amazon.in/");
	
		  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ear buds");
		  Thread.sleep(3000);
		  driver.findElement(By.id("nav-search-submit-button")).click();
		  
		 /* String json = "{\r\n" + 
		    		"    \"example\": {\r\n" + 
		    		"        \"productName1\": \"boAt Airdopes\",\r\n" + 
		    		"        \"productName2\": \"Mivi DuoPods\",\r\n" + 
		    		"        \"productName3\": \"Noise Air Buds\"\r\n" + 
		    		"    }\r\n" + 
		    		"}";*/
		  
		  FileReader reader = new FileReader("E:\\Nisum-Training\\selenium\\SeleniumTest\\products.json");
	    	
	        JSONObject obj = new JSONObject(reader);
	        
	        System.out.println(obj);
	        
			/*
			 * String earbudName1 = obj.getJSONObject("example").getString("productName1");
			 * String earbudName2 = obj.getJSONObject("example").getString("productName2");
			 * String earbudName3 = obj.getJSONObject("example").getString("productName3");
			 * String ddd = "TestNisumTrial";
			 */
	        
	        
	        List<String> productNames = new ArrayList<String>();
	        productNames.add(obj.get("productName1").toString());
	        productNames.add(obj.get("productName2").toString());
	        productNames.add(obj.get("productName3").toString());
	        
	      
//	        List<String> l = Arrays.asList(earbudName1,earbudName2,earbudName3,ddd);
	        WebElement body = driver.findElement(By.tagName("body"));
	        String bodyText = body.getText();

	        
//	        boolean check and 
	        for(String lll: productNames) {
	        	if(bodyText.contains(lll)) {
	        		System.out.println(lll+ "   exists");	
	        	}
	        }
	        
	        
		} 
		catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.close();
	        
	}
	    
    public static void main(String[] args) throws InterruptedException, IOException, ParseException {
    	searchAmazon();
    }
}