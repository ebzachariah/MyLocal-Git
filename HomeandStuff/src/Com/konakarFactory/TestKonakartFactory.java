package Com.konakarFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestKonakartFactory {
	
	
	@Test(priority=2)

	public void testKonakart(){
		System.setProperty("webdriver.chrome.driver",
					  "C:/drivers/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.konakart.com/konakart/LogIn.action");
		
		pageKonakartFactory login1= PageFactory.initElements(driver, pageKonakartFactory.class);
		
		login1.loginkonakart("anjuelvin@gmail.com", "anju1234","DVD Movies", "Games", "1335","5656","table");
		
		
		
	}



@Test(priority=1)

public void testKonakart2(){
	System.setProperty("webdriver.chrome.driver",
				  "C:/drivers/chromedriver_win32/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.konakart.com/konakart/LogIn.action");
	
	driver.close();
}
}