package SeleniumBasicPackage;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoSuggestionDemo {
	
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aniket_Testing\\Chrome_Driver_Latest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='From']")).click();
		WebElement form = driver.findElement(By.xpath("//input[@placeholder='From']"));
		form.sendKeys("Sydney");
		Thread.sleep(2000);
		form.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		form.sendKeys(Keys.ENTER);
	}

}
