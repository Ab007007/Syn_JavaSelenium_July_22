package com.synechron.selenium.AutomationTraining.switchto;

import org.openqa.selenium.By;

import com.synechron.selenium.AutomationTraining.utils.BaseClass;

public class HandlingAlerts extends BaseClass
{
	public static void main(String[] args) throws InterruptedException {
		driver.get("http://formy-project.herokuapp.com/switch-window");
		driver.findElement(By.id("alert-button")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		
	}

}
