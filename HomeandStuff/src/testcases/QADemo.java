package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class QADemo {
	
   @Test
   
       public void QADemotest () {
	   
	   System.setProperty("webdriver.chrome.driver", 
			   "C:/drivers/chromedriver_win32/chromedriver.exe");
	   
	   WebDriver driver = new ChromeDriver();
	   driver.manage(). window().maximize();
	   
	   driver.get("http://demoqa.com/");
	   
	   driver.findElement(By.xpath("//li[@id='menu-item-374']/a")).click();
	
	  
	   driver.findElement(By.id("name_3_firstname")).sendKeys("Elvin");
	 
	   driver.findElement(By.id("name_3_lastname")).sendKeys("Bose");
	   
	   driver.findElement(By.xpath("//input[@value='married']")).click();
	   
	   driver.findElement(By.xpath("//input[@value='cricket ']")).click();
	   
	   //Dropdown
	   Select sel1 = new Select(driver.findElement(By.xpath("//select[@id='dropdown_7']")));
	   //id("dropdown_7")));
	   
	   sel1.selectByValue("India");
	   
	   driver.findElement(By.id("mm_date_8")).sendKeys("9");
			   
	   driver.findElement(By.id("dd_date_8")).sendKeys("1");
	   
	   driver.findElement(By.id("yy_date_8")).sendKeys("1982");
	   
	   
	   
	   //driver.close();   
	   
 }
	
}
