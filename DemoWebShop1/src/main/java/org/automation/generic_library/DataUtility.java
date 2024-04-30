package org.automation.generic_library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility implements FrameworkConstant{
	
	public String getDataFromPropertiesFile(String Key) throws IOException 
	{
		FileInputStream fls = new FileInputStream(properties_Path);
		
		Properties pobj = new Properties();
		pobj.load(fls);
		String value = pobj.getProperty(Key);
		return value;
		//used in VerifyDemoWebShop program in Task package
		
		
	}
	
	public String getDataFromExcel(String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fls = new FileInputStream(excel_Path);
		Workbook book=WorkbookFactory.create(fls);
		String value=book.getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
		return value;



	}
	
	public static Object[][] getMultipleDataFromExcelFile(String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fls = new FileInputStream(excel_Path);
		Workbook book=WorkbookFactory.create(fls);
		Sheet sh = book.getSheet(sheetName);
		
		int lastRowNuM = sh.getPhysicalNumberOfRows();
		int lastCellNum = sh.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] arr = new Object[lastRowNuM][lastCellNum];
		
		for(int  i = 1; i < lastRowNuM; i++)
		{
			for(int j = 0; j < lastCellNum; j++)
			{
				arr[i - 1][j] = sh.getRow(i).getCell(j).toString();
			}
		}
		return arr;
	}

}
