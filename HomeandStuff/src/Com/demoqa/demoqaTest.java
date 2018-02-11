package Com.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class demoqaTest {
	
@Test

		public void demoqatest() {
	System.setProperty("webdriver.chrome.driver","C:/drivers/chromedriver_win32/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demoqa.com/");
	
	demoqaPage test=PageFactory.initElements(driver, demoqaPage.class);
	
	test.qatest("elvin","zachariah","Canada","9","1","1982","1234567891","PICHAPPI","elvinbose@reddiffmail.com",
			"niyan0312","niyan0312","how are you?");
	
}
	

}
