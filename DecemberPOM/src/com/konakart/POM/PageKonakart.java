package com.konakart.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageKonakart {
	WebDriver driver;
	public PageKonakart(WebDriver driver) {
		this.driver=driver;		
	}
	//login account
	@FindBy(how=How.XPATH,using="//*[@id=\"my-account\"]/span[2]/a") WebElement myaccount;
	@FindBy(how=How.ID,using="loginUsername") WebElement username;
	@FindBy(how=How.ID,using="password") WebElement pass;
	//@FindBy(how=How.XPATH,using="//*[@id=\"continue-button\"]/span") WebElement signin;
	@FindBy(how=How.XPATH,using="//*[@id=\"continue-button\"]/span") WebElement signin;
	
	//check logo
	@FindBy(how=How.ID,using="logo-1") WebElement logo;
	
	//checking item in Computer Peripherals
	@FindBy(how=How.XPATH,using="//*[@id=\"main-menu\"]/div/a") WebElement Computer;
	//Testing the product keyboard
	@FindBy(how=How.LINK_TEXT,using="Logitech Illuminated Keyboard")  WebElement keyboard;
	//@FindBy(how=How.ID,using="prodQuantityId") WebElement numbers;
	@FindBy(how=How.XPATH,using="//*[@id=\"AddToCartForm\"]/div[6]/a") WebElement add;
	@FindBy(how=How.XPATH,using="//*[@id=\"shopping-cart\"]/span[2]") WebElement shoppingcart;
	//@FindBy(how=How.ID,using="q-39479") WebElement Quantity;
	@FindBy(how=How.ID,using="couponCode") WebElement coupon;
	@FindBy(how=How.ID,using="giftCertCode") WebElement giftcode;
	@FindBy(how=How.XPATH,using="//*[@id=\"cost-overview\"]/table/tbody/tr[1]/td[2]") WebElement subtotal;
	@FindBy(how=How.XPATH,using="//*[@id=\"cost-overview\"]/table/tbody/tr[3]/td[2]") WebElement total;
	@FindBy(how=How.XPATH,using="//*[@id=\"cost-overview\"]/table/tbody/tr[4]/td[2]") WebElement rewards;
	@FindBy(how=How.XPATH,using="//*[@id=\"continue-button\"]/span") WebElement checkout;
	//Testing the Games
	@FindBy(how=How.XPATH,using="//*[@id=\"main-menu\"]/div/a[2]") WebElement games;
	@FindBy(how=How.LINK_TEXT,using="Call Of Duty") WebElement callofduty;
	//@FindBy(how=How.ID,using="prodQuantityId") WebElement dropdown3;
	@FindBy(how=How.XPATH,using="//*[@id=\"AddToCartForm\"]/div[6]/a") WebElement add2;
	public void konakart(String v1,String v2) {
		myaccount.click();
		username.sendKeys(v1);
		pass.sendKeys(v2);
		signin.click();
		logo.getText();
	}
	
	public void computerproducts(String v6, String v7) {
		Computer.click();
		keyboard.click();
		//new Select(numbers).selectByVisibleText(v4);
		add.click();
		shoppingcart.click();
		//Quantity.clear();
		//Quantity.sendKeys(v5);
		coupon.sendKeys(v6);
		giftcode.sendKeys(v7);
		subtotal.getText();
		total.getText();
		rewards.getText();
		checkout.click();
	}
	public void gameproducts() {
		games.click();
		callofduty.click();
		//dropdown3.clear();
		//dropdown3.sendKeys(v8);
		add2.click();
		
	}
}

