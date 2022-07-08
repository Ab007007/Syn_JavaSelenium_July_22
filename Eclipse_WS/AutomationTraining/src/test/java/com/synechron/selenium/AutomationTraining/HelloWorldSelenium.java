package com.synechron.selenium.AutomationTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldSelenium {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Selenium Automation Learning...");
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Test Browser launched successully...");
	}

}
