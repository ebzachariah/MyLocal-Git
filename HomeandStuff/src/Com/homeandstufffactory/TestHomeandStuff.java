package Com.homeandstufffactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestHomeandStuff {
	
@Test
	public void homeandstuff() {
		System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.homeandstuff.com");
		
		pagehomeansstuff egoods= PageFactory.initElements(driver, pagehomeansstuff.class);
		egoods.searchprdt("TV","3");
		//Assert.assertEquals(driver.getTitle(), "Furniture, Kitchen, Dining Room, Entertainment, Bedroom Sets, Outdoor, Fireplaces","Title not found");
		String str="$39.99";
		Assert.assertEquals("$39.9", str, "String not found");
	
		
		
	}

}
