package SeleniumBasicPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop 
{
	@Test
	public void test()
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Aniket_Testing\\Chrome_Driver_Latest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://ui.vision/demo/webtest/dragdrop/");
		
		//To enable mouse Interreaction , invoke action class on driver instance
		Actions ac = new Actions(driver);
		
		WebElement e1 = driver.findElement(By.id("three"));
		WebElement e2 = driver.findElement(By.id("bin"));
		
		ac.dragAndDrop(e1, e2).perform();
	}

}
