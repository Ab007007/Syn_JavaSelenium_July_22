package com.synechron.selenium.AutomationTraining.sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.selenium.AutomationTraining.utils.BaseClass;

public class WaitForVisibleDemo extends BaseClass 
{

	public static void main(String[] args) {
		driver.get("file:///D:/Synechron_04_07_Selenium/html/tiimeout.html");
		
		driver.findElement(By.tagName("button")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("demo"))));
		
		System.out.println(ele.getText());
		System.out.println(driver.findElement(By.id("demo2")).getText());
		
		

	}
}
