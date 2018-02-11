package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	private String baseUrl= "http://www.homeandstuff.com";
  @Test
  public void searchforaProduct() {
	  System.setProperty("webdriver.chrome.driver",
			  "C:/drivers/chromedriver_win32/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(baseUrl);
	  String product = "24\" Speaker Stand";
	  //WebElement txtSearch = driver.findElement(By.name("search_field"));
	 // txtSearch.sendKeys(product);
	  driver.findElement(By.name("search_field")). sendKeys(product);
	  WebElement btnGo = driver.findElement(By.xpath("//*[@id='search']/form/div/span/input"));
	  btnGo.click();
	  
	 WebElement lnkResult = driver.findElement(By.linkText("24\" Speaker Stand"));
	 
	 lnkResult. click();
	 
	 WebElement lb2Price = driver.findElement(By.className("mi_price"));
	 
	 String Price = lb2Price.getText();
	 
	 Assert.assertEquals(Price, "$119.00", "Price is not correct");
	 
	 
	 
	 driver.close();
	 
  }
	 
	 
	 
	 @Test(priority=1)
	  public void Addaproducttoshoppingcart() {
		  System.setProperty("webdriver.chrome.driver",
				  "C:/drivers/chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(baseUrl);
		  String product = "24\" Speaker Stand";
		  //WebElement txtSearch = driver.findElement(By.name("search_field"));
		 // txtSearch.sendKeys(product);
		  driver.findElement(By.name("search_field")). sendKeys(product);
		  WebElement btnGo = driver.findElement(By.xpath("//*[@id='search']/form/div/span/input"));
		  btnGo.click();
		  
		 WebElement lnkResult = driver.findElement(By.linkText("24\" Speaker Stand"));
		 
		 lnkResult. click();
		 
		 WebElement lb2Price = driver.findElement(By.className("mi_price"));
		 
		 String Price = lb2Price.getText();
		 
		 Assert.assertEquals(Price, "$119.00", "Price is not correct");
		 
		 driver.findElement(By.xpath("//*[@id=\"form4428\"]/input[5]")).clear();
		 
		 driver.findElement(By.xpath("//*[@id=\"form4428\"]/input[5]")).sendKeys("2");
		 
		 driver.findElement(By.xpath("//*[@id=\"form4428\"]/input[6]")).click();
		 
		 //driver.findElement(By.xpath("//*[@id=\"svgminicart\"]")).getText();
		 
		 String cart = driver.findElement(By.xpath("//*[@id=\"svgminicart\"]")).getText();
		 
		 Assert.assertEquals(cart, "2 ITEMS");
		 
		 String subtotal = driver.findElement(By.xpath("/html/body/div[4]/form/table/tbody/tr[3]/td/table/tbody/tr/td[3]/table/tbody/tr[1]/td[2]")).getText();
		 
		 Assert.assertEquals(subtotal, "$238.00");
		 
		 String Total = driver.findElement(By.xpath("/html/body/div[4]/form/table/tbody/tr[3]/td/table/tbody/tr/td[3]/table/tbody/tr[2]/td[2]")).getText();
		 
		 Assert.assertEquals(Total, "$238.00");
		 
		 driver.findElement(By.xpath("//*[@id=\"Credit Card or PayPal Checkout\"]")).click();
		 
		 driver.findElement(By.xpath("/html/body/div[4]/form/table/tbody/tr[7]/td/table/tbody/tr[1]/td[1]/table/tbody/tr[2]/td[2]/input")).sendKeys("elvinzach@gmail.com");

		 driver.findElement(By.xpath("/html/body/div[4]/form/table/tbody/tr[7]/td/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/input")).sendKeys("elvin");
		 
		 driver.findElement(By.xpath("/html/body/div[4]/form/table/tbody/tr[7]/td/table/tbody/tr[1]/td[1]/table/tbody/tr[4]/td[2]/input")).sendKeys("zach");
		 
		 //driver.findElement(By.xpath("<input class=\"addr\" type=\"text\" name=\"Address\" value=\"\" size=\"28\" maxlength=\"35\">")).sendKeys("xyz12345");
		 
		 driver.findElement(By.xpath("/html/body/div[4]/form/table/tbody/tr[7]/td/table/tbody/tr[1]/td[1]/table/tbody/tr[6]/td[2]/input")).sendKeys("xyz1234");
		 
		 driver.findElement(By.name("City")).sendKeys("Ernakulam");
		 
		 Select sel1 = new Select(driver.findElement(By.name("State")));
		 
		 sel1.selectByVisibleText("Ontario");
		 
		 driver.findElement(By.name("Zip")).sendKeys("682313");
		 
		 driver.findElement(By.name("Country")).sendKeys("Canada");

		 driver.findElement(By.name("Phone")).sendKeys("112233445566");
		 
		 driver.findElement(By.name("usebilling")).click();
		 
		 Select sel2 = new Select(driver.findElement(By.name("paytype")));
		
		 sel2.selectByValue("3");
		 
		 driver.findElement(By.name("pay1")).sendKeys("987645123");
		 
		 driver.findElement(By.xpath("/html/body/div[4]/form/table/tbody/tr[10]/td/table/tbody/tr[4]/td[2]/input")).sendKeys("1d3");
		 
		 driver.findElement(By.name("pay2")).sendKeys("elvin");
		 
		 driver.findElement(By.name("pay3")).sendKeys("CBC");
		 
		 Select sel3 = new Select(driver.findElement(By.name("pay4_1")));
		 
		 sel3. selectByVisibleText("05");
		 
		 Select sel4 = new Select(driver.findElement(By.name("pay4_2")));
		 
		 sel4. selectByValue("2017");
		 
		 driver.findElement(By.name("email_list")).click();
		 
		 driver.findElement(By.name("email_list")).click();
		 
		// driver.findElement(By.id("Return to Cart")).click();
		 
		
		
		   
	  
	  
	  
  }
}
