package konakart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class konakartTest {
     WebDriver driver;
	


	@Test
	
	public void Verify_Valid_Login() {
		System.setProperty("webdriver.chrome.driver",
				  "C:/drivers/chromedriver_win32/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage(). window().maximize();
	driver.get("http://www.konakart.com/konakart/Welcome.action");
	}
	
	
	
	konakartPages select_Prdt = PageFactory.initElements(driver, konakartPages.class);
	
		

	}


	 
	
