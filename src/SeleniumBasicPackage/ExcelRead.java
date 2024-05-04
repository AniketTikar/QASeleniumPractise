package SeleniumBasicPackage;

import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelRead {
	
	@Test
	public void test() throws  Exception
	{
		//WebDriver driver  = new ChromeDriver();
		
		Workbook workbook = WorkbookFactory.create(new FileInputStream("D:\\Aniket_Testing\\ExcelFile\\Prac.xlsx"));
		
		//Get the Sheet by its Index
		Sheet sh = workbook.getSheetAt(0);
		
		//get the sheet by its name
		//Sheet sh = workbook.getSheet("sheet1");
		
		//Read the specific cell
		Row row = sh.getRow(1);
		Cell cell = row.getCell(0);
		String data1 = cell.getStringCellValue();
		System.out.println(data1);
		
		String data2 = sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println(data2);
		
		workbook.close();
		
		
		
		
		
		
		/*
		 * 
		//Locate the File
		File file = new File("D:\\Aniket_Testing\\ExcelFile\\Prac.xlsx\\");
		
		//Making the file Enable for Reading
		FileInputStream fis1 = new FileInputStream(file);
		
		
		
		  //FileInputStream fis = new FileInputStream(new File("D:\\Aniket_Testing\\ExcelFile\\Prac.xlsx\\"));
		  XSSFWorkbook wb = new XSSFWorkbook(fis1);
		 XSSFSheet sh = wrb.getSheetAt(0);
		
		//Define the Workbook
		//  .xlsx  --> XSSFWorkbook       .lsx --> HSSFWorkbook
		XSSFWorkbook wb = new XSSFWorkbook(fis1);
		sheet sh = wb.getSheetAt(0);
		 */
		
	}

}
