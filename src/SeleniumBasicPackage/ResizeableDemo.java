package SeleniumBasicPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ResizeableDemo {

	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aniket_Testing\\Chrome_Driver_Latest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
        
		WebElement frame1 = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));

		driver.switchTo().frame(frame1);
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));

		Actions ac = new Actions(driver);
		ac.dragAndDropBy(element, 300, 100).perform();
	}
}
