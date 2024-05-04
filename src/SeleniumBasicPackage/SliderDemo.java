package SeleniumBasicPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderDemo {
	
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aniket_Testing\\Chrome_Driver_Latest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/slider/colorpicker.html");
		
		driver.manage().window().maximize();
		
		WebElement greenSlider = driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
		
		Actions ac = new Actions(driver);
		ac.dragAndDropBy(greenSlider, -100, 200).perform();
	}

}
