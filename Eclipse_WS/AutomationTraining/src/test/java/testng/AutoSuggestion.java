package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.synechron.selenium.AutomationTraining.utils.BaseClass;
import com.synechron.selenium.AutomationTraining.utils.PropertiesReader;

public class AutoSuggestion extends BaseClass
{
	
	@BeforeClass
	public void launch() {
		driver.get(PropertiesReader.getProperty("gurl"));
	}

	
	@BeforeMethod
	public void setup() {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}
	
	@AfterMethod
	public void teardown() {
		System.out.println("##########################################");
	}
	
	
	@AfterClass
	public void closeDriver() {
		driver.close();
	}
	
	@Test(dataProvider = "searchCompany", dataProviderClass = DataproviderDemo.class)
	public void searhOrg(String cname) {
		
		System.out.println("Entering " + cname);
		driver.findElement(By.name("q")).sendKeys(cname);
		
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li[@role='presentation']"));
		
		System.out.println("Total suggestions " + autoSuggestions.size());
		
		autoSuggestions.forEach(ele -> System.out.println("AutoSuggetion : " + ele.getText()));
		driver.findElement(By.name("q")).clear();
		
	}
	
	
	
}
