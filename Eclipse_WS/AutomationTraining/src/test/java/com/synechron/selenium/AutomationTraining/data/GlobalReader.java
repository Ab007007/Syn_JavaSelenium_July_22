package com.synechron.selenium.AutomationTraining.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalReader {

	
	public static void main(String[] args) throws IOException {
		File f = new File("data//config.properties");
		FileInputStream fis = new FileInputStream(f);
		
		Properties props = new Properties();
		props.load(fis);
		System.out.println(props.getProperty("url"));
		System.out.println(props.getProperty("username"));
		System.out.println(props.getProperty("password"));
		fis.close();
	}
}
