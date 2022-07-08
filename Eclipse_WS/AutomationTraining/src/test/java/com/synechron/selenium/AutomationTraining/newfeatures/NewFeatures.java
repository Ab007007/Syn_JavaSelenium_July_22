package com.synechron.selenium.AutomationTraining.newfeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

import com.synechron.selenium.AutomationTraining.utils.BaseClass;

public class NewFeatures extends BaseClass 
{
	public static void main(String[] args) {
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement resizeEle = driver.findElement(By.xpath("//a[text()='Resizable']/parent::li"));
		
		WebElement newEle = driver.findElement
				(RelativeLocator.with(By.xpath("//a[text()='Resizable']")).above
						(driver.findElement(By.tagName("li"))));
		
		System.out.println(newEle.getText());
	}

}
