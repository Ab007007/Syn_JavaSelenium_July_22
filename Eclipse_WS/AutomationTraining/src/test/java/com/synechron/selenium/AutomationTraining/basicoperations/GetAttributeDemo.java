package com.synechron.selenium.AutomationTraining.basicoperations;

import org.openqa.selenium.By;

import com.synechron.selenium.AutomationTraining.utils.BaseClass;

public class GetAttributeDemo extends BaseClass
{

	
	public static void main(String[] args) {
		driver.get("https://www.google.com/");
		String text = driver.findElement(By.xpath("//a[@role='button' and contains(@href,'google.co.in')]")).getAttribute("aria-label");
	
		System.out.println("text on App Icon "  + text);
	}
}
