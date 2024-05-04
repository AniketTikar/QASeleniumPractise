package SeleniumBasicPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelWriteDemo {
	
/*
	
	@Test
	public void test()
	{
		FileInputStream fs = new FileInputStream(new File("D:\\Aniket_Testing\\ExcelFile\\Prac.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sh = workbook.getSheetAt(0);
		
		//F3: Row is active and cell in Inactive
		sh.getRow(3).createCell(4).setCellValue("Ani");
		
		//Row is inactive and cell is also inactive
		sh.createRow(4).createCell(7).setCellValue("ani23");
		
		FileOutputStream fos = new FileOutputStream("D:\\\\Aniket_Testing\\\\ExcelFile\\\\Prac.xlsx");
		workbook.write(fos);
		workbook.close();
		fos.close();
		
		
	}
	
*/

}
