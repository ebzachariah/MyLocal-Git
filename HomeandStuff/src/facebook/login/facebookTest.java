package facebook.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class facebookTest {
	
	WebDriver driver;
	
	By username = By.className("inputtext");
	
	By password = By.id("pass");
	
	By clickonLoginButton = By.id("u_0_3");
	
	public facebookTest(WebDriver driver) {
		this.driver=driver;
	}
	
	public void typeUserName(String user) {
		
		driver.findElement(username).sendKeys("elvinbose@rediffmail.com"); 
	}
	
	

}
