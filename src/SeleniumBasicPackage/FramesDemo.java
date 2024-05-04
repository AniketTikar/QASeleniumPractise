package SeleniumBasicPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesDemo
{
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aniket_Testing\\Chrome_Driver_Latest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("tnb-google-search-input")).click();
		
		/*
		
		//we can switch between the frames by using Index of Frame or By Using Name of Frame or By using Location of the Frame
		driver.switchTo().frame(0);
		String msg = driver.findElement(By.id("iframeResult")).getText();
		System.out.println(msg);
		
		//driver.findElement(By.xpath("//*[@id=\"pagetop\"]/a[2]")).click();
		driver.findElement(By.linkText("Log in")).click();
		
		/*
		 * control can not be switch between the frames directly 
		 * switch to parent frame 1st the switch to targeted frame
		 */
		
	}

}
