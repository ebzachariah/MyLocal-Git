package com.gmail.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GmailLogin {
@Test
	public static void gmaillogin() throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver",
				  "C:/drivers/chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  File file = new
		  File("//C:\\Users\\elvin\\eclipse-workspace\\DecemberPOM\\gmail.properties");
		  FileInputStream fileInput = null;
			
			try {
				fileInput = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			Properties prop = new Properties();
			
			try {
				prop.load(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
			}
		  
		  
		  driver.get(prop.getProperty("url"));
		  
		  driver.findElement(By.id(prop.getProperty("username"))).sendKeys(prop.getProperty("username_value"));
		  driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		  
	
		         Thread.sleep(2000);
		
		  driver.findElement(By.xpath(prop.getProperty("Password"))).sendKeys(prop.getProperty("Password_value"));
		  driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content")).click();
	}

}
