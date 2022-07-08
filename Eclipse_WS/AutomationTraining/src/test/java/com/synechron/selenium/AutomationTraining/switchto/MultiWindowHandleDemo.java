package com.synechron.selenium.AutomationTraining.switchto;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.synechron.selenium.AutomationTraining.utils.BaseClass;

public class MultiWindowHandleDemo extends BaseClass
{
	
	public static void main(String[] args) throws InterruptedException {
		
		driver.get("https://www.irctc.co.in/eticketing/errors.html#");
		
		driver.findElement(By.linkText("Contact Us")).click();
		
		Thread.sleep(5000);
		Set<String> windowIDs = driver.getWindowHandles();
		
		Iterator<String> it = windowIDs.iterator();
		
		String parentWindowID = it.next();
		String childWindowID = it.next();
		System.out.println("Parent window id : " + parentWindowID);
		System.out.println("child window id : " + childWindowID);
		
		driver.switchTo().window(childWindowID);
		
		List<WebElement> hyperlinks = driver.findElements(By.tagName("a"));
		System.out.println("--------------------------CHILD-----------------------------------");
		
		hyperlinks.forEach(link -> System.out.println("email id s : " + link.getText()));
		
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(5000);
		
		driver.switchTo().window(parentWindowID);
		System.out.println("--------------------------PARENT-----------------------------------");
		List<WebElement> phyperlinks = driver.findElements(By.tagName("a"));
		
		phyperlinks.forEach(link -> System.out.println("email id s : " + link.getText()));
		Thread.sleep(5000);
		driver.close();
		
		
		
	}

}
