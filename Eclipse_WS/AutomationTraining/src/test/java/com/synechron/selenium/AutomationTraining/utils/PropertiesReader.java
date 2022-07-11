package com.synechron.selenium.AutomationTraining.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesReader {

	
	
	public static String getProperty(String key) {
		String value=null;
		try {
			File f = new File("data//config.properties");
			FileInputStream fis = new FileInputStream(f);
			
			Properties props = new Properties();
			props.load(fis);
			value = props.getProperty(key);
			fis.close();
		}
		catch(Exception ex)
		{
			System.out.println("Exception while reading the file");
		}
		
		return value;
	}
}
