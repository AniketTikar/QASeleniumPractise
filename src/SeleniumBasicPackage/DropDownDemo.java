package SeleniumBasicPackage;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownDemo {
	
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aniket_Testing\\Chrome_Driver_Latest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://magento.softwaretestingboard.com/");
		
		driver.manage().window().maximize(); 
		
		//Clicking on WebElement with the help of XPath
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
		
		//Input Box 
		driver.findElement(By.id("email")).sendKeys("miamikettikar@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tikar@1999");
		
		driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();
		driver.findElement(By.id("ui-id-3")).click();
		
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[2]/div/div/ul[1]/li[1]/a")).click();
		
		//Step1 : Locate the DropDown
		WebElement dropDown = driver.findElement(By.id("sorter"));
		
	   //Step2 : Enable the drop down for select
		Select s1 = new Select(dropDown);
		
		//Step3 : Select the value

		//s1.selectByIndex(0);                    //Selected by Index
		s1.selectByValue("name");               //Selected By Value
		
	   s1.selectByVisibleText("Price");        //Selected by Text
	   
	   /*
	   WebElement firstOption = s1.getFirstSelectedOption();
	   System.out.println(firstOption.getText());
	   */
		
		/*
		
		//multiple Select
		WebElement d1 = driver.findElement(By.id("sorter"));
		Select s2 = new Select(d1);
		//s2.selectByIndex(0);
		s2.selectByValue("name");
		
		//s2.selectByVisibleText("Price");
		
		//s2.selectByIndex(2);
		
		List <WebElement> allItems = s2.getAllSelectedOptions();
		System.out.println(allItems.size());
		
		s2.deselectByValue("name");
		
		*/
	   
	   	
		
	}

}
