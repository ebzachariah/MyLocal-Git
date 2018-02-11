package Com.konakarFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class pageKonakartFactory {
	
	WebDriver driver;
	public pageKonakartFactory(WebDriver driver) {
		this.driver=driver;
	}
	
    @FindBy(linkText="My Account") WebElement MyAccount;
    @FindBy(how=How.ID,using="loginUsername") WebElement username;
    @FindBy(how=How.ID,using="password") WebElement pass;
    @FindBy(how=How.XPATH,using="//*[@id=\"continue-button\"]/span") WebElement signin;
    @FindBy(how=How.LINK_TEXT,using="Computer Peripherals") WebElement computer;
    @FindBy(how=How.LINK_TEXT,using="Canon I-SENSYS LBP7680CX Printer") WebElement canonprinter;
    @FindBy(how=How.ID,using="top-cat-list") WebElement dropdownproduct;
   
    @FindBy(how=How.ID,using="search-input") WebElement searchbox;  
    @FindBy(how=How.ID,using="search-button") WebElement searchbtn;
    @FindBy(how=How.LINK_TEXT,using="The Hunger Games") WebElement hungergame;
    @FindBy(how=How.XPATH,using="//*[@id=\"AddToCartForm\"]/div[6]/a") WebElement addtocart;
    @FindBy(how=How.XPATH,using="//*[@id=\"shopping-cart\"]/span[2]") WebElement shoppingcart;
    @FindBy(how=How.ID,using="couponCode") WebElement coupon;
    @FindBy(how=How.ID,using="giftCertCode") WebElement giftcertificate;    
    //@FindBy(how=How.ID,using="rewardPoints") WebElement reward;
    @FindBy(how=How.XPATH,using="//*[@id=\"continue-button\"]/span") WebElement checkout;
    @FindBy(how=How.ID,using="shippingQuotes") WebElement Shippingmethod;
    @FindBy(how=How.XPATH,using="//*[@id=\"continue-button\"]/span") WebElement confirm;
    public void loginkonakart(String value1,String value2,String value3,String value4,String value5,String value6,
    		String value8) {
    	MyAccount.click();
    	username.sendKeys(value1);
    	pass.sendKeys(value2);
    	signin.click();
    	computer.click();
    	canonprinter.click();
    	new Select (dropdownproduct).selectByVisibleText(value3);
    	
    	searchbox.sendKeys(value4);
    	searchbtn.click();
    	hungergame.click();
    	addtocart.click();
    	shoppingcart.click();
    	coupon.sendKeys(value5);
    	giftcertificate.sendKeys(value6);
    	//reward.sendKeys(value7);
    	checkout.click();
    	new Select(Shippingmethod).selectByValue(value8);
    	confirm.click();
    	
    	driver.close();
    	
}
    @FindBy(linkText="My Account") WebElement MyAccount1;
    
    public void loginkonakart() {
    	
    	MyAccount1.click();
	}
    
}
