package Mavenprojclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testfacebook {

	
	@Test
	 
	public void TestFireFox(){
	 
	    WebDriver driver=new ChromeDriver();
	 
	     driver.manage().window().maximize();
	 
	     driver.get("http://www.facebook.com");
	     
	 
	     driver.quit();
	 
	}
	
	
}
