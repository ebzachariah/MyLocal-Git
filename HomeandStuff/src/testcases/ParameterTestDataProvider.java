package testcases;

import org.testng.annotations.DataProvider;

public class ParameterTestDataProvider {
	@DataProvider(name="Countryinfo")
	
	public static Object[][] getCountryData(){
		return new Object[][] {
		
			{"India","Newdelhi"},
			
			{"Canada","Tokyo"},
			
			{"US","Washington"}
			
		};
		
		}
				
	
	}


