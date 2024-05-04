package SeleniumBasicPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOverDemo
{
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aniket_Testing\\Chrome_Driver_Latest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://magento.softwaretestingboard.com/sale.html");
		Actions ac = new Actions(driver);
		
		WebElement hoverButton = driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]/span[2]"));
		ac.moveToElement(hoverButton).perform();
		
		WebElement top = driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]/span[2]"));
		ac.moveToElement(top).perform();
		
		WebElement hoverTop = driver.findElement(By.id("ui-id-11"));
		ac.moveToElement(hoverTop).click().perform();
		
		//This step is all in one steps
		//ac.moveToElement(hoverButton).moveToElement(top).moveToElement(hoverTop).click().perform();
	}

}
