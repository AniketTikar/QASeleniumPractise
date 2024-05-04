package SeleniumBasicPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableDemmo
{
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aniket_Testing\\Chrome_Driver_Latest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		//S1: Locate the WebTable
		WebElement table = driver.findElement(By.id("customers"));
		
		//S2: Get all rows and store in the list
		List<WebElement> rowList = table.findElements(By.tagName("tr"));
		System.out.println(rowList.size());
		
		System.out.println("--------------------------------------");
		
		//S3: Case1:Iterate over each row and get column Required
		for(int r=1 ; r<(rowList.size()) ; r++)
		{
			List<WebElement> columnList = rowList.get(r).findElements(By.tagName("td"));
			System.out.println(columnList.get(1).getText());
		}
		
		System.out.println("---------------------------------------");
		
		//S3: Case2:Iterate over each row and get all Column
		for(int n=1 ; n<(rowList.size()) ; n++)
		{
			List<WebElement> colsList = rowList.get(n).findElements(By.tagName("td"));
			for(int c=1 ; c<(colsList.size()) ; c++)
			{
				System.out.println(colsList.get(c).getText());
			}
		}
		
		System.out.println("---------------------------------------------");
		
		//S3 :Case3 : Iterate over each row and get required column on given condition
		for(int a=1 ; a<(rowList.size()) ; a++)
		{
			List<WebElement> cols = rowList.get(a).findElements(By.tagName("td"));
			if(cols.get(0).getText().matches("Google"))
			{
				System.out.println(cols.get(1).getText()+"  "+cols.get(2).getText());
			}
		}
	}

}
