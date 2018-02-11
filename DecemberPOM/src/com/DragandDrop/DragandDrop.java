package com.DragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		System.setProperty("webdriver.chrome.driver",
				  "C:/drivers/chromedriver_win32/chromedriver.exe");

			
			WebDriver driver = new ChromeDriver();
			driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
			
			WebElement drag = driver.findElement(By.id("draggable"));
			WebElement drop = driver.findElement(By.id("droppable"));

			Actions builder = new Actions(driver);
			 
			Action dragAndDrop = builder.clickAndHold(drag)
			 
			.moveToElement(drop)
			 
			.release(drop)
			 
			.build();
			 
			dragAndDrop.perform();

	}

}
