package Com.Konakart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class pages {
	
	WebDriver driver;
	public pages(WebDriver driver) {
		this.driver=driver;
	}
	
    By MyAccount=By.linkText("My Account");
    By username= By.id("loginUsername");
	By password=By.id("password");
	By signin=By.xpath("//*[@id=\"continue-button\"]/span");
	By computer=By.linkText("Computer Peripherals");
	By canonprinter=By.linkText("Canon I-SENSYS LBP7680CX Printer");
	By product=By.id("top-cat-list");
	
	public void logintokonakart(String uname,String pass,String value) {
		driver.findElement(MyAccount).click();
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(signin).click();
		driver.findElement(computer).click();
		driver.findElement(canonprinter).click();
		new Select(driver.findElement(product)).selectByVisibleText(value);
	}
	
	
    public void clickmyaccount() {
    	driver.findElement(MyAccount).click();
    }
	public void sendusername() {
		driver.findElement(username).sendKeys("anjuelvin@gmail.com");
	}
	public void sendpassword() {
		driver.findElement(password).sendKeys("anju1234");
	}
	public void clicksigin() {
		driver.findElement(signin).click();
	}
	public void clickcomputer() {
		driver.findElement(computer).click();
	}
	public void clickcanon() {
		driver.findElement(canonprinter).click();
	}
	public void dropdownproducts(String value) {
		new Select(driver.findElement(product)).selectByVisibleText(value);
		}
	
}

