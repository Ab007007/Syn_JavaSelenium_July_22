package com.synechron.selenium.AutomationTraining.popup;

import java.io.IOException;

import org.openqa.selenium.By;

import com.synechron.selenium.AutomationTraining.utils.BaseClass;
import com.synechron.selenium.AutomationTraining.utils.PropertiesReader;

public class WindowsPopUp extends BaseClass
{

	static {
		try {
			Runtime.getRuntime().exec("D:\\Synechron_04_07_Selenium\\Eclipse_WS\\autoit\\fileupload.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		driver.get(PropertiesReader.getProperty("furl")+ "/fileupload");
		
		driver.findElement(By.id("file-upload-field")).click();
		
		

		
		
	}
}
