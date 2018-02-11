package Com.Konakart1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class KonakartTest {

@Test
	
	public void konakart_Test() {
		System.setProperty("webdriver.chrome.driver",
				  "C:/drivers/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage(). window().maximize();
	driver.get("https://www.konakart.com/konakart/LogIn.action");
	//click on My Account
	pages loginpage=new pages(driver);
	loginpage.clickmyaccount();
	//send user name
	loginpage.sendusername();
	//send password
	loginpage.sendpassword();
	loginpage.clicksigin();
	loginpage.clickcomputer();
	loginpage.clickcanon();
	loginpage.dropdownproducts("DVD Movies");
}
}