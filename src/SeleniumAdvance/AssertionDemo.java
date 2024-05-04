package SeleniumAdvance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aniket_Testing\\Chrome_Driver_Latest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
	}
	

}
