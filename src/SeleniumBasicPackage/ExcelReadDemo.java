package SeleniumBasicPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.*;
import java.util.*;



public class ExcelReadDemo {

/*
	@Test
	public void test() throws FileNotFoundException, Exception 
	{

		//Locate the File
		File file = new File("D:\\Aniket_Testing\\ExcelFile\\Prac.xlsx\\");

		//Making the file Enable for Reading
		FileInputStream fis1 = new FileInputStream(file);
	



		//FileInputStream fis = new FileInputStream(new File("D:\\Aniket_Testing\\ExcelFile\\Prac.xlsx\\"));
		

		//Define the Workbook
		//  .xlsx  --> XSSFWorkbook       .lsx --> HSSFWorkbook
		XSSFWorkbook wb = new XSSFWorkbook(fis1);
		
		//Find the sheet
		Sheet sh = wb.getSheetAt(0);
		
		//Sheet sh = wb.getSheet("sheet");
		
		//Read the specific cell
		Row row = sh.getRow(1);
		Cell cell = row.getCell(0);
		String data1 = cell.getStringCellValue();
		System.out.println(data1);
		
		String data2 = sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println(data2);
		
		//Read the cell with no data
		
		
		String nullData = sh.getRow(2).getCell(3).getStringCellValue();
		System.out.println(nullData);
		
		
		//Read the Numeric cell data
		System.out.println(sh.getRow().getCell.getNumericCellValue());
		
		//-------->To return the integer form of no.
		System.out.println((int)sh.getRow(3).getCell(4).getNumericCellValue());
		
		//Numeric to string for a application 
		String rawData = sh.getRow(2).getCell(3).getRawValue();
		System.out.println(rawData);
		
		//Number of row in the sheet
		int noOfRows = sh.getPhysicalNumberOfRows();
		System.out.println(noOfRowa);
		
		//Number of Cell in a Sheet
		int noOfCells = sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println(noOfCells);
		
		System.out.println("LastRowNum "+sh.getLastRowNum);
		System.out.println("LastCellNum "+ sh.getRow(0).getLastCellNum());
		
		//Iterate over Last Row
		int lastRowIndex = sh.getLastRowNum();
		
		for(int i=0 ; i<=lastRowIndex ; i++)
		{
			System.out.println("Student Name"+sh.getRow(i).getCell(0).getStringCellValue());
			System.out.println("Student ID"+sh.getRow(i).getCell(0).getRawValue());
		}
		
		
		
		
		
		
		
		
		
		FileInputStream fs = new FileInputStream(File("D:\\Aniket_Testing\\ExcelFile\\Prac.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sh = workbook.getSheetAt(0);

		 

	Workbook workbook = WorkbookFactory.create(new FileInputStream("D:\\Aniket_Testing\\ExcelFile\\Prac.xlsx\\"));

	}


*/
}
