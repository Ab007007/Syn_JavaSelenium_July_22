package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.media.jfxmedia.logging.Logger;

public class GooglePage {
	
	
	@FindBy(name = "q")
	WebElement searchBox;
	
	@FindBy(xpath = "//ul[@role='listbox']/li[@role='presentation']")
	List<WebElement> autoSuggestions;
	
	
	public void enterSearchBox(String name)
	{
		searchBox.sendKeys(name);
		
	}
	
	public void printSuggestions() {
		System.out.println("Total suggestions " + autoSuggestions.size());
		
		autoSuggestions.forEach(ele -> System.out.println("AutoSuggetion : " + ele.getText()));
	}
	
	public void printSuggestions(ExtentTest test) {
		System.out.println("Total suggestions " + autoSuggestions.size());
//		autoSuggestions.forEach(ele -> System.out.println("AutoSuggetion : " + ele.getText()));
		for (WebElement ele : autoSuggestions) 
		{
			test.log(LogStatus.INFO	, ele.getText());
			
		}
	}
	
	public void clearSearchBox() {
		searchBox.clear();
	}

	
	public GooglePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
