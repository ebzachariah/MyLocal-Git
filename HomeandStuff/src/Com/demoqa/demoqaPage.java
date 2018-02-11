package Com.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class demoqaPage {
	
	WebDriver driver;
	public demoqaPage (WebDriver driver) {
		this.driver=driver;
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"menu-item-38\"]/a") WebElement home;
	@FindBy(how=How.ID,using="menu-item-374") WebElement registration;
	@FindBy(how=How.ID,using="name_3_firstname") WebElement name;
	@FindBy(how=How.ID,using="name_3_lastname")WebElement lastname;
	@FindBy(how=How.XPATH,using="//*[@id=\"pie_register\"]/li[2]/div/div/input[2]") WebElement married;	
	@FindBy(how=How.XPATH,using="//*[@id=\"pie_register\"]/li[3]/div/div/input[3]") WebElement hobby;
	@FindBy(how=How.ID,using="dropdown_7")WebElement dropdown;
	@FindBy(how=How.ID,using="mm_date_8") WebElement drop2;
	@FindBy(how=How.ID,using="dd_date_8") WebElement drop3;
	@FindBy(how=How.ID,using="yy_date_8") WebElement drop4;
	@FindBy(how=How.ID,using="phone_9") WebElement phone;
	@FindBy(how=How.ID,using="username") WebElement username;
	@FindBy(how=How.ID,using="email_1") WebElement email;	
	@FindBy(how=How.ID,using="password_2") WebElement password1;
	@FindBy(how=How.ID,using="confirm_password_password_2") WebElement confirmpassword;
	@FindBy(how=How.ID,using="description") WebElement discription;
	
	
	public void qatest(String v1,String v2,String v3,String v4,String v5,String v6,String v7,String v8,String v9,
			String v10,String v11, String v12) {
		
		home.click();
		registration.click();
		name.sendKeys(v1);
		lastname.sendKeys(v2);
		married.click();
		hobby.click();
		new Select(dropdown).selectByVisibleText(v3);
		new Select(drop2).selectByVisibleText(v4);
		new Select(drop3).selectByValue(v5);
		new Select(drop4).selectByValue(v6);
		phone.sendKeys(v7);
		username.sendKeys(v8);
		email.sendKeys(v9);
		password1.sendKeys(v10);
		confirmpassword.sendKeys(v11);
		discription.sendKeys(v12);

	
	}	
}
