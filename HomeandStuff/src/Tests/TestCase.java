package Tests;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import Pages.Header;

	public class TestCase {
		private WebDriver driver;
		@BeforeTest
		public void beforeTest(){
			System.setProperty("webdriver.chrome.driver",
					  "C:/drivers/chromedriver_win32/chromedriver.exe");			  
		}
		@BeforeMethod
		public void setUp(){
			driver = new ChromeDriver();	
			driver.get("http://www.homeandstuff.com");
		}
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		@Test
		public void searchTest(){
			Header header = new Header(driver);
			header.searchProduct("24\" Speaker Stand");
		}

	}


