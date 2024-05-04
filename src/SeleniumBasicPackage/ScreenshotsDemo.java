package SeleniumBasicPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotsDemo {
	
	@Test
	public void test() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aniket_Testing\\Chrome_Driver_Latest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		
		//S1 : convert driver object from webdriver interface to takes Screenshots Interface
		TakesScreenshot sh = (TakesScreenshot)driver;
		
		//S2 : Use appropate method to capture image as a file type
		File file = sh.getScreenshotAs(OutputType.FILE);
		
		//S3 : Copy file to desire Location in the system
		FileUtils.copyFile(file, new File("D:\\Aniket_Testing\\Screenshots\\ani.png"));
		
		driver.close();
	}
	
	

}
