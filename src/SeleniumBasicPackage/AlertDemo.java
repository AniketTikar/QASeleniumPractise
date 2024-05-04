package SeleniumBasicPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo {
	
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aniket_Testing\\Chrome_Driver_Latest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("analystic")).click();
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		String msg = driver.switchTo().alert().getText();               //Give the text on alert
		System.out.println(msg);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.linkText("Alert with OK & Cancel")).click(); 
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.linkText("Alert with Textbox")).click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		driver.switchTo().alert().sendKeys("Aniket Patil");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	//	Alert alertObj = driver.switchTo().alert();  //we can use only alertObj every where instead of driver.switch.alert 
		
	}

}
