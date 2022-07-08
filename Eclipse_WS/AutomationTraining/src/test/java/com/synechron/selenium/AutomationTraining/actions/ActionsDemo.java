package com.synechron.selenium.AutomationTraining.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.synechron.selenium.AutomationTraining.utils.BaseClass;

public class ActionsDemo extends BaseClass
{
	
	public static void main(String[] args) throws InterruptedException {
		driver.get("http://formy-project.herokuapp.com/form");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);
		act.sendKeys("aravinda").perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("aravinda").perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("aravinda").perform();
		
	}

}
