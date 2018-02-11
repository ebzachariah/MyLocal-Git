package Com.Konakart1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test2Konakart {
	
	
	
@Test

public void testKonakart(){
	System.setProperty("webdriver.chrome.driver",
				  "C:/drivers/chromedriver_win32/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.konakart.com/konakart/LogIn.action");
	
	pages loginpage=new pages(driver);
	
	loginpage.logintokonakart("anjuelvin@gmail.com", "anju1234","DVD Movies");

	
	
	
		
		
	}

}
