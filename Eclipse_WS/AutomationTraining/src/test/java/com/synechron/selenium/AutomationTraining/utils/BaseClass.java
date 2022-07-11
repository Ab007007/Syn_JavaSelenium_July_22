package com.synechron.selenium.AutomationTraining.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver = null;
	
	
	static {
		System.out.println("Base Class Creating driver object");
		//System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		switch(PropertiesReader.getProperty("browser"))
		{
		case "chrome" :
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "edge":	
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		
		case "ff":	
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.valueOf(PropertiesReader.getProperty("timeout"))));
		driver.manage().window().maximize();
		System.out.println("Default timeout " + driver.manage().timeouts().getImplicitWaitTimeout());
	}
}
