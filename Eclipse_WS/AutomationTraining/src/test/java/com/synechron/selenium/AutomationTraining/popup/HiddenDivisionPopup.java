package com.synechron.selenium.AutomationTraining.popup;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.selenium.AutomationTraining.utils.BaseClass;
import com.synechron.selenium.AutomationTraining.utils.PropertiesReader;

public class HiddenDivisionPopup extends BaseClass
{

	
	public static void main(String[] args) {
		driver.get(PropertiesReader.getProperty("furl")+ "/modal");
		
		driver.findElement(By.id("modal-button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("exampleModalLabel"))));
		
		
		System.out.println(driver.findElement(By.id("exampleModalLabel")).getText());
		
//		Actions act = new Actions(driver);
//		act.click(driver.findElement(By.id("ok-button"))).perform();
//		
		
		driver.findElement(By.id("close-button")).click();
		
		
		
	}
}
