package Com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.wordpress.pages.LoginNewPage;

public class VerifyValidLogin {


	@Test
	
	public void Verify_Valid_Login() {
		System.setProperty("webdriver.chrome.driver",
				  "C:/drivers/chromedriver_win32/chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage(). window().maximize();
	driver.get("https://wordpress.com/log-in");
	
	//LoginPages login=new LoginPages(driver);
	LoginNewPage login_page = PageFactory.initElements(driver, LoginNewPage.class);
	//login_page.typeUserName("elvin");
	//login_page.typePassword("demo123");
	login_page.login_word_press("elvin","demo123");
	
	
    
	
	
	
	}
}
