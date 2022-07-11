package com.synechron.selenium.AutomationTraining.data;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.synechron.selenium.AutomationTraining.utils.BaseClass;
import com.synechron.selenium.AutomationTraining.utils.PropertiesReader;

public class HandlingAutoSuggestionsUsingExternalData extends BaseClass {

	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		driver.get(PropertiesReader.getProperty("gurl"));

		int rowCount = ExcelReader.getRowCount("autosuggestion");
		String cname;
		for (int i = 1; i < rowCount; i++)
		{
			cname = ExcelReader.getValue("autosuggestion", i, 0);
			System.out.println("Entering " + cname);
			driver.findElement(By.name("q")).sendKeys(cname);
			
			List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li[@role='presentation']"));
			
			System.out.println("Total suggestions " + autoSuggestions.size());
			
			autoSuggestions.forEach(ele -> System.out.println("AutoSuggetion : " + ele.getText()));
			driver.findElement(By.name("q")).clear();
		}
		driver.close();
	}
}
