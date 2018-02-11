/**
 * 
 */
package Com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Com.wordpress.pages.LoginPages;

/**
 * @author elvin
 *
 */
public class VerifyWordPressLogin {
	
	@Test
	
	public void VerifyValidLogin() {
		System.setProperty("webdriver.chrome.driver",
				  "C:/drivers/chromedriver_win32/chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage(). window().maximize();
	driver.get("https://wordpress.com/log-in");
	
	LoginPages login=new LoginPages(driver);
	login.typeUserName("elvin");
	login.typePassword("demo123");
	login.clickonLoginButton();
	
	
	}
	
}



