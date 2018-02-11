package testcases;

import org.testng.annotations.Test;

public class ParameterTest {

	@Test(dataProvider="Countryinfo",dataProviderClass = ParameterTestDataProvider.class)
	
	public void showCountryDetails(String Country, String Capital) {
		
	System.out.println("Capital of "+ Country +  ":" + Capital);

}
}
