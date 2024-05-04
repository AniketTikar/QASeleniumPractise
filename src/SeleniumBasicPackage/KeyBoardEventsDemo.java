package SeleniumBasicPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyBoardEventsDemo {
	
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aniket_Testing\\Chrome_Driver_Latest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		
		WebElement sourceElement  = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[4]/pre/span"));
		WebElement destinationElement = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]//div[6]/pre"));
		
		Actions ac = new Actions(driver);
		
		ac.keyDown(sourceElement, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		
		ac.keyDown(destinationElement, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	}

}
