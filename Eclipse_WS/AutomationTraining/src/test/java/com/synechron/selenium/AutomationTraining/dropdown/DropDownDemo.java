package com.synechron.selenium.AutomationTraining.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.synechron.selenium.AutomationTraining.utils.BaseClass;

public class DropDownDemo extends BaseClass 
{
	public static void main(String[] args) throws InterruptedException {
		driver.get("http://formy-project.herokuapp.com/form");
		
		WebElement dropDown = driver.findElement(By.id("select-menu"));
		
		Select sel = new Select(dropDown);
		sel.selectByIndex(1); // 0-1
		Thread.sleep(5000);
		sel.selectByVisibleText("5-9");
		Thread.sleep(5000);
		sel.selectByValue("4"); //10+
	}

}
