package com.synechron.selenium.AutomationTraining.sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.selenium.AutomationTraining.utils.BaseClass;

public class WebDriverWaitDemo extends BaseClass 
{
	
	public static void main(String[] args) 
	{
		driver.get("https://www.flipkart.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"))));
		
		//ele.click();
		System.out.println("Popup closed");
	}

}
