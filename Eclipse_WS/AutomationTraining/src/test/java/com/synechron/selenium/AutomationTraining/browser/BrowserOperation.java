package com.synechron.selenium.AutomationTraining.browser;

import org.openqa.selenium.By;

import com.synechron.selenium.AutomationTraining.utils.BaseClass;

public class BrowserOperation extends BaseClass 
{
	
	public static void main(String[] args) throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/K.G.F:_Chapter_1");
		Thread.sleep(2000);
		driver.findElement(By.id("n-mainpage-description")).click();
		Thread.sleep(2000);
		System.out.println("Current url : " + driver.getCurrentUrl());
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
	}

}
