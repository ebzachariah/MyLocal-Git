package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookmonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				  "C:/drivers/chromedriver_win32/chromedriver.exe");
			  //"C:/drivers/chromedriver_win32/chromedriver.exe");
				  
				  WebDriver driver = new ChromeDriver();
				  
				  driver.get("https://www.facebook.com");
				  
				  
				  WebElement month_dropdown=driver.findElement(By.id("month"));
				  
				  Select month=new Select(month_dropdown);
				  
				  month.selectByVisibleText("Aug");

	}

}
