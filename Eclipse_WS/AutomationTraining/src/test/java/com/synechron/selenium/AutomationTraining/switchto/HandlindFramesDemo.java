package com.synechron.selenium.AutomationTraining.switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.synechron.selenium.AutomationTraining.utils.BaseClass;

public class HandlindFramesDemo extends BaseClass
{
	public static void main(String[] args) 
	{
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement srcEle = driver.findElement(By.id("draggable"));
		WebElement destEle = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(srcEle, destEle).perform();
		
//		act.doubleClick()
//		act.contextClick()
//		act.sendKeys(Keys.ALT,Keys.ENTER)
		System.out.println("--- print all the text -----");		
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Draggable")).click();
	}

}
