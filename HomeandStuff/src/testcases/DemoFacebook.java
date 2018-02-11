package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoFacebook {
  @Test
      public void facebookregestration() {
  
	  System.setProperty("webdriver.chrome.driver",
	  "C:/drivers/chromedriver_win32/chromedriver.exe");
  //"C:/drivers/chromedriver_win32/chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.facebook.com");
	  
	  driver.manage(). window().maximize();
	  driver.findElement(By.xpath("//*[@id=\"u_0_9\"]")).sendKeys("elvin");
      driver.findElement(By.className("inputtext")).sendKeys("elvinbose@hotmail.com");
	  
	  driver.findElement(By.id("u_0_b")).sendKeys("bose");
	  //Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"u_0_3\"]")).click();
	  driver.findElement(By.id("u_0_r")).click();


	  //WebElement month_dropdown=driver.findElement(By.id("month"));
	  
	  //Select month=new Select(month_dropdown);
	  
	  //month.selectByVisibleText("Aug");
	  
	  Select sel1 = new Select(driver.findElement(By.id("month")));
	  sel1.selectByVisibleText("Sep");
	  Select sel2 = new Select(driver.findElement(By.id("day")));
	  sel2.selectByValue("1");
	  
	  
	  
	  driver.close();
}
}
