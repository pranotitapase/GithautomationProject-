package javaPackage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadingExcelsheet {

	public static void main(String[] args) throws Exception {
		//specify the location of excel file
		File src = new File("C:\\Users\\acs\\Documents\\excel sheet demo.xlsx");
		//Load file
		FileInputStream fis = new FileInputStream(src);
		//Load workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//lOAD WORKSHEET
		XSSFSheet sh = wb.getSheet("Demo");
		//Get the name of loaded sheet
		System.out.println(sh.getSheetName());
			
		

	}

}
