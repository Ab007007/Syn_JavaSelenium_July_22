package com.synechron.selenium.AutomationTraining.sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;
import com.synechron.selenium.AutomationTraining.utils.BaseClass;

public class FluentWaitDemoUsingLambda extends BaseClass 
{

	
	public static void main(String[] args) {
		driver.get("file:///D:/Synechron_04_07_Selenium/html/tiimeout.html");
		
		driver.findElement(By.tagName("button")).click();
		
		FluentWait<WebElement> wait = new FluentWait<WebElement>(driver.findElement(By.id("demo")))
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class);
		
//		wait.until((ele, flag) -> {
//			
//		});
		
	}
}
