package SeleniumBasicPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebDriverInitialization {
	
	//Create a instance of WebDriver
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		//For Chrome
		System.setProperty("webdriver.chrome.driver", "D:\\Aniket_Testing\\Chrome_Driver_Latest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		/*
		 * For IE
		 * System.setProperty("webdriver.ie.driver","path of chrome driver");
		 * driver = new InternetExplore();
		 * 
		 * For FireFox
		 * System.setProperty("webdriver.gcoek.driver","path of FireFox");
		 * driver = new FireFox();
		 */
	}
	
	@Test
	public void test()
	{
		//Open the URL of AUT
		driver.get("https://magento.softwaretestingboard.com/");
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		
		//get the Titel of the page
		String titel = driver.getTitle();
		System.out.println(titel);
		 
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();  //To close the current Browser
		
		//driver.quit();   //To close all open Windows
		
	}

}
