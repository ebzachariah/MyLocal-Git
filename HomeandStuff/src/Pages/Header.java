package Pages;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Header {
		WebDriver driver;
		@FindBy(name = "search_field")
		WebElement txtSearch;
		@FindBy(xpath = "//*[@value='Go!']")
		WebElement btnSearch;	
		@FindBy(xpath = "//*[text()='Bathroom']")
		WebElement lnkBathroom;
		public void clickBathroom(){
			lnkBathroom.click();
		}
		public Header(WebDriver drv){
			driver = drv;	
			PageFactory.initElements(driver, this);
		}
		private void setSearch(String product){
			txtSearch.sendKeys(product);
		}
		private void clickSearchButton(){
			btnSearch.click();
		}
		
		public void searchProduct(String product){
			setSearch(product);
			clickSearchButton();		
		}
		
		
	}

