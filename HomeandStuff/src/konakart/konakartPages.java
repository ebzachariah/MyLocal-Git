package konakart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class konakartPages {
	
WebDriver driver;
public konakartPages(WebDriver driver) {
	this.driver=driver;
}
	
	@FindBy(xpath="//*[@id=\"top-cat-list\"]") WebElement dropdownbtn;
	
	@FindBy(name="searchText") WebElement txtsearch;
	
	@FindBy(id="search-button") WebElement clickbtn;
	
	public void dropdownbtn() {
		dropdownbtn.click();
		
	}
	public  void DropDown() {
	      Select DropDown = new Select(dropdownbtn);
	      DropDown.selectByVisibleText("Computer Peripherals");	      
	}

		
	}
	

