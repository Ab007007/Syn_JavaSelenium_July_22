package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.synechron.selenium.AutomationTraining.utils.BaseClass;

public class ExecuteJSDemo extends BaseClass
{
	
	@Test
	public void executeJS() throws InterruptedException
	{
		driver.get("http://formy-project.herokuapp.com/scroll");
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollTo(0, 500);");
	}
	
	
	@Test
	public void scrollOnEle() throws InterruptedException
	{
		driver.get("http://formy-project.herokuapp.com/scroll");
		Thread.sleep(15000);
		WebElement ele = driver.findElement(By.id("name"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}

}
