package com.synechron.selenium.AutomationTraining.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

	public static Workbook wb = null;
	public static Sheet sheet = null;
	
//	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		File f = new File("data//testdata.xls");
//		FileInputStream fis = new FileInputStream(f);
//		Workbook wb = WorkbookFactory.create(fis);
//		int sheetCount = wb.getNumberOfSheets();
//		for(int i = 0; i<sheetCount; i++)
//		{
//			System.out.println(wb.getSheetName(i));
//		}
//		fis.close();
//		
//		// Reading all the rows
//		Sheet sheet = wb.getSheet("autosuggestion");
//		int rowcount = sheet.getLastRowNum()+1;
//		for (int i = 0; i < rowcount; i++) {
//			
//			Row row = sheet.getRow(i);
//			String companyName = row.getCell(0).toString();
//			System.out.println(companyName);
//		}
//		
//	}
	
	public static Workbook getWorkBook() throws EncryptedDocumentException, IOException
	{
		File f = new File("data//testdata.xls");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		return wb;
	}
	
	
	public static Sheet getSheet(String name) throws EncryptedDocumentException, IOException
	{
		wb = getWorkBook();
		sheet = wb.getSheet(name);
		return sheet;
	}
	
	public static int getRowCount(String name) throws EncryptedDocumentException, IOException {
		sheet = getSheet(name);
		int rowcount = sheet.getLastRowNum()+1;
		return rowcount;
	}
	
	
	public static String getValue(String name, int rownumber, int columnnumber) throws EncryptedDocumentException, IOException
	{
		sheet = getSheet(name);
		Row row = sheet.getRow(rownumber);
		String companyName = row.getCell(columnnumber).toString();
		return companyName;
		
	}
	
}
