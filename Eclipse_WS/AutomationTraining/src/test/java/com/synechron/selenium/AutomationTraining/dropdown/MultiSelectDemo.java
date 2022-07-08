package com.synechron.selenium.AutomationTraining.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.synechron.selenium.AutomationTraining.utils.BaseClass;

public class MultiSelectDemo extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		driver.get("file:///D:/Synechron_04_07_Selenium/html/multiSelect.html");

		WebElement dropDown = driver.findElement(By.tagName("select"));

		Select sel = new Select(dropDown);
		
		sel.selectByIndex(1);
		Thread.sleep(2000);
		sel.selectByValue("audi");
		Thread.sleep(2000);
		sel.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		
		sel.deselectByIndex(3);
		Thread.sleep(2000);
		sel.deselectByValue("saab");
		Thread.sleep(2000);
		sel.deselectByVisibleText("Volvo");
		Thread.sleep(2000);
		
		
		sel.selectByIndex(1);
		Thread.sleep(2000);
		sel.selectByValue("audi");
		Thread.sleep(2000);
		sel.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		sel.deselectAll();
	}

}
