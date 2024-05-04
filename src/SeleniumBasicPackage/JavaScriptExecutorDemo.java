package SeleniumBasicPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutorDemo {
	
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aniket_Testing\\Chrome_Driver_Latest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://magento.softwaretestingboard.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor jase = (JavascriptExecutor)driver;
		
		//Print the Title of the page
		String script = " return document.title";
		String title = (String) jase.executeScript(script);
		System.out.println(title);
		
		//Click Button by Scrooling
		WebElement searchButton = driver.findElement(By.xpath("/html/body/div[2]/footer/div/ul/li[1]/a"));
		jase.executeScript("arguments[0].scrollIntoView(true);", searchButton);
		
	}

}
