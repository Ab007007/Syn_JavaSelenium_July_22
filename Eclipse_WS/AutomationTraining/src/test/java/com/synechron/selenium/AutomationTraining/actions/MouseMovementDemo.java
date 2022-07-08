package com.synechron.selenium.AutomationTraining.actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.selenium.AutomationTraining.utils.BaseClass;

public class MouseMovementDemo extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://www.flipkart.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
		WebElement ele = wait.until(
				ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"))));
		ele.click();
		
		
		WebElement fashionElement = driver.findElement(By.xpath("//div[text()='Fashion']/ancestor::a"));
		WebElement electronicsElement = driver.findElement(By.xpath("//div[text()='Electronics']/ancestor::a"));
		WebElement homeElement = driver.findElement(By.xpath("//div[text()='Home']/ancestor::a"));
		WebElement btsElement = driver.findElement(By.xpath("//div[text()='Beauty, Toys & More']/ancestor::a"));

	
		Actions act = new Actions(driver);
		act.moveToElement(btsElement).perform();
		Thread.sleep(3000);
		printItems();
		act.moveToElement(electronicsElement).perform();
		Thread.sleep(3000);
		printItems();
		act.moveToElement(homeElement).perform();
		Thread.sleep(3000);
		printItems();
		act.moveToElement(fashionElement).perform();
		Thread.sleep(3000);
		printItems();
	
	
	}
	
	private static void printItems() {
		System.out.println("--------------------------------------------------------------------------------------------------");
		List<WebElement> items = driver.findElements(By.xpath("//div[@class='ZEl_b_ _3joddx _2ogGYG _23xUYh _3pAV4E']//a"));
		items.forEach(item -> System.out.println(item.getText()));
		System.out.println("--------------------------------------------------------------------------------------------------");
		
	}

}
