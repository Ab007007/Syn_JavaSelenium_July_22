package com.synechron.selenium.AutomationTraining.basicoperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.synechron.selenium.AutomationTraining.utils.BaseClass;

public class HandlingAutoSuggestions extends BaseClass {

	
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Synechron");
		
		Thread.sleep(5000);
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li[@role='presentation']"));
		
		System.out.println("Total suggestions " + autoSuggestions.size());
	//	autoSuggestions.forEach(System.out :: println);
		
		autoSuggestions.forEach(ele -> System.out.println("AutoSuggetion : " + ele.getText()));
		
//		driver.close();
	}
}
