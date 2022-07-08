package com.synechron.selenium.AutomationTraining.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver = null;
	
	
	static {
		System.out.println("Base Class Creating driver object");
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		System.out.println("Default timeout " + driver.manage().timeouts().getImplicitWaitTimeout());
	}
}
