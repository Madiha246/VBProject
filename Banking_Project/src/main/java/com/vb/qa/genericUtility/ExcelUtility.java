package com.vb.qa.genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtility {

	FileInputStream fis;
	FileOutputStream fos;
	
	public String readExcelFile(String sheet,int row, int cell) throws EncryptedDocumentException, IOException {
		fis=new FileInputStream("D:\\Selenium-ms\\Banking_Project\\src\\test\\resources\\testdata_Vb.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		return wb.getSheet(sheet).getRow(row).getCell(cell).toString();
	}
	
	public String readExcelFileDate(String sheet, int row, int cell) throws EncryptedDocumentException, IOException, ParseException {
		fis = new FileInputStream( "D:\\Selenium-ms\\Banking_Project\\src\\test\\resources\\testdata_Vb.xlsx"); 
		Workbook wb = WorkbookFactory.create(fis);
		DataFormatter formatter = new DataFormatter(); 
		String excelDate = formatter.formatCellValue( wb.getSheet(sheet).getRow(row).getCell(cell));
		SimpleDateFormat inputFormat = new SimpleDateFormat("MMM-yy");
		SimpleDateFormat outputFormat = new SimpleDateFormat("MM/yy");
		Date date = inputFormat.parse(excelDate);
		return outputFormat.format(date);
	}
}
