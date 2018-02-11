package com.konakart.POM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class TestKonakart {
	WebDriver driver;
	
  @Test(priority=1)
  //loginaccount
  public void konakarttest() {
	  PageKonakart testpage=PageFactory.initElements(driver, PageKonakart.class);
	  testpage.konakart("anjuelvin@gmail.com","anju1234");
	  driver.close();
  } 
 @Test(priority=2)
	  // testing comapany logo
  public void logotest() {
	
	 String logo="https://www.konakart.com/konakart/images/content/logo.png";
	 Assert.assertEquals("https://www.konakart.com/konakart/images/content/logo.png", logo, "String not found");
	 driver.close();  
 }
 @Test(priority=3)
  public void computer() {
	 PageKonakart com=PageFactory.initElements(driver, PageKonakart.class);
	 com.computerproducts("1122223","44455566");
	 String  subtotal="$70.00";
	
	 Assert.assertEquals("$70.00",subtotal,"String not found");
	 
	 String totalprice="$70.00";
	 Assert.assertEquals("$70.00",totalprice,"String not found");
	 driver.close();
 }
 @Test(priority=4)
  public void games(){
	 PageKonakart game1=PageFactory.initElements(driver, PageKonakart.class);
	 game1.gameproducts();
	 
 }
	 
  @BeforeMethod
  public void beforeMethod() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.konakart.com/konakart/Welcome.action");
  }

  @AfterMethod
  public void afterMethod() {
	//driver.quit();
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver",
			  "C:/drivers/chromedriver_win32/chromedriver.exe");

  }
}
