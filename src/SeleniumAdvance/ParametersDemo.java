package SeleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
	@Test
	@Parameters({"username","password"})
	public void test(String p ,String q)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aniket_Testing\\Chrome_Driver_Latest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://magento.softwaretestingboard.com/");
		
		driver.manage().window().maximize(); 
		
		//Clicking on WebElement with the help of XPath
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
		
		//Input Box 
		driver.findElement(By.id("email")).sendKeys(p);
		driver.findElement(By.id("pass")).sendKeys(q);
		
		driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();
		
	}

}
