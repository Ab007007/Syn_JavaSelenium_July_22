package testng;

import org.testng.annotations.Test;

public class TestDataProvider {

	
	@Test(dataProvider = "createUser", dataProviderClass = DataproviderDemo.class)
	public void createCustomer(String n, String ln, int phone) 
	{
		System.out.println(n + " : ");
	}
}
