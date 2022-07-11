package com.synechron.selenium.AutomationTraining.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.synechron.selenium.AutomationTraining.utils.PropertiesReader;

public class GlobalReaderUsingFunction {

	
	public static void main(String[] args) throws IOException {
		
		System.out.println(PropertiesReader.getProperty("url"));
	}
}
