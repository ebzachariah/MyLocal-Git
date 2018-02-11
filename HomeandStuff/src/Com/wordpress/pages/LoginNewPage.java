package Com.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginNewPage {
	
	WebDriver driver;
	
	public LoginNewPage(WebDriver driver) {
		this.driver=driver;
	}
	

	@FindBy(id="usernameOrEmail") WebElement username;
	
	//@FindBy(id="password") WebElement password;
	
	//@FindBy(xpath="//*[@id=\"primary\"]/div/main/div/div[1]/div/form/div[1]/div[2]/button")
	WebElement login_button;
	
	@FindBy(linkText="Lost your password?")WebElement forget_password_link;
	
	public void login_word_press(String uid,String pass) {
	
		username.sendKeys(uid);
		//password.sendKeys(pass);
		//login_button.click();
		forget_password_link.click();
	
	
	
	}
}

