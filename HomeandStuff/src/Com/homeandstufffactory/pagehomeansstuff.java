package Com.homeandstufffactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;




public class pagehomeansstuff {
	
	WebDriver driver;
	public pagehomeansstuff(WebDriver driver) {
		this.driver=driver;
	}

	@FindBy(how=How.NAME,using="search_field") WebElement search;
	@FindBy(how=How.XPATH,using="//*[@id=\"search\"]/form/div/span/input") WebElement btngo;
	@FindBy(how=How.XPATH,using="//*[@id=\"middle-full\"]/table/tbody/tr[1]/td[2]/a/b") WebElement tvstand;

	
	@FindBy(how=How.XPATH,using="//*[@id=\"form4531\"]/input[5]") WebElement add;
	@FindBy(how=How.XPATH,using="//*[@id=\"form4531\"]/input[6]") WebElement addtocart;
	//@FindBy(how=How.ID,using="Continue Shopping") WebElement shoppingbtn;
	//@FindBy(how=How.XPATH,using="//*[@id=\"logo\"]/a/b") WebElement home;
	@FindBy(how=How.XPATH,using="/html/body/div[4]/form/table/tbody/tr[3]/td/table/tbody/tr/td[3]/table/tbody/tr[2]/td[2]") WebElement total;
	
	
	public void searchprdt(String v1,String v2) {
		search.sendKeys(v1);
		btngo.click();
		tvstand.click();
		
		add.clear();
		add.sendKeys(v2);
		addtocart.click();
		//shoppingbtn.click();
		//home.click();
		total.getText();
		 
	}		

}
