package com.synechron.selenium.AutomationTraining.basicoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFill 
{
	public static void main(String[] args) {
		System.out.println("Welcome to Selenium Automation Learning...");
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://formy-project.herokuapp.com/form");
		
//		WebElement firstname = driver.findElement(By.id("first-name"));
//		firstname.sendKeys("Aravinda");
		
		driver.findElement(By.id("first-name")).sendKeys("Aravinda");
		driver.findElement(By.id("last-name")).sendKeys("B");
		driver.findElement(By.id("job-title")).sendKeys("Trainer");
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		
		
	}

}
