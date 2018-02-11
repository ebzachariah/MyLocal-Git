/**
 * 
 */
package Com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author elvin
 *
 */
public class LoginPages {

	WebDriver driver; 
	
	By username = By.id("usernameOrEmail");
	
	By password = By.xpath("//*[@id=\"password\"]");
	
	By loginButton = By.xpath("//*[@id=\"primary\"]/div/main/div/div[1]/div/form/div[1]/div[2]/button");
	
	public LoginPages(WebDriver driver) {
		
    this.driver = driver;
    
	}
	//public void typeUserName() {
    public void typeUserName(String uid) {
		driver.findElement(username).sendKeys(uid);
		
	}
    //public void typePassword() {
    
	public void typePassword(String pass) {
	
	    driver.findElement(password).sendKeys(pass);
	}
	public void clickonLoginButton() {
		
		driver.findElement(loginButton).click();
		
	}
}
