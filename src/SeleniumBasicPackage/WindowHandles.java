package SeleniumBasicPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandles
{
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aniket_Testing\\Chrome_Driver_Latest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.salesforce.com/in/");
		
		driver.findElement(By.linkText("Start free trial")).click();
		
		Set<String> handles =driver.getWindowHandles();     //Store all the open tabs in one set
		System.out.println(handles);
		for(String h:handles)
		{
			System.out.println("h " + h);
			System.out.println("WH" +driver.getWindowHandle());     //Returns the address of window
			
		}
		
		Iterator<String> iteratorWindow = handles.iterator();
		String parentWindow = iteratorWindow.next();
		System.out.println(parentWindow);
		String childWindow = iteratorWindow.next();
		
		driver.switchTo().window(childWindow);
		System.out.println(childWindow);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Aniket");
		driver.findElement(By.name("UserLastName")).sendKeys("Tikar");
		
		driver.switchTo().window(parentWindow);
	}

}
