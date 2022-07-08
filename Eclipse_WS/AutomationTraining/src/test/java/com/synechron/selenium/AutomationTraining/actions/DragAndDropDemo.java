package com.synechron.selenium.AutomationTraining.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.synechron.selenium.AutomationTraining.utils.BaseClass;

public class DragAndDropDemo extends BaseClass
{
	
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement srcEle = driver.findElement(By.id("draggable"));
		WebElement destEle = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(srcEle, destEle).perform();
		
//		act.doubleClick()
//		act.contextClick()
//		act.sendKeys(Keys.ALT,Keys.ENTER)
		System.out.println("--- print all the text -----");		
	}

}
