package testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.synechron.selenium.AutomationTraining.utils.BaseClass;
import com.synechron.selenium.AutomationTraining.utils.PropertiesReader;

import page.GooglePage;

public class PrintSuggestionUsingPOM extends BaseClass
{

	GooglePage gp = null;
	ExtentReports reports = null;
	ExtentTest test = null;
	@BeforeClass
	public void launch() {
		reports = new ExtentReports("target\\AutomationReport.html");
		gp = new GooglePage(driver);
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
		reports.flush();
		driver.close();
	}
	
	
	
	@Test(dataProvider = "searchCompany", dataProviderClass = DataproviderDemo.class)
	public void searhOrgUsingPOM(String cname) throws IOException {
		test = reports.startTest("Google Search Test is starting");
		test.log(LogStatus.INFO	, "My Test is started");
		test.log(LogStatus.INFO	, "Entering " + cname);

		gp.enterSearchBox(cname);
		test.log(LogStatus.INFO	, "Getting auto suggetions");

		gp.printSuggestions(test);
		test.log(LogStatus.INFO	, "Printing auto suggestions");
//		Assert.assertEquals(, expected);

		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("target//SS_" +cname + ".png"));
		
		gp.clearSearchBox();
		reports.endTest(test);
	}
	
}
