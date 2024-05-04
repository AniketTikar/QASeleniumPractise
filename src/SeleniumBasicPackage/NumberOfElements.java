package SeleniumBasicPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NumberOfElements {
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aniket_Testing\\Chrome_Driver_Latest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		
		//Total no. of Links 
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of Links : "+links.size());
		
		for(WebElement l:links)
		{
			System.out.println("Links Address : "+l.getAttribute("href"));
			System.out.println("Link Name : "+l.getText());
			System.out.println("--------------------------------------");
		}
		
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[2]/div/div/ul[1]/li[1]/a")).click();
		
		//Number of Dropdown
		List<WebElement> noOfDropDown = driver.findElements(By.tagName("select"));
		System.out.println("Number of DropDowns" +noOfDropDown.size());
		
		
		//Number of Options in DropDown
		WebElement ssDc = driver.findElement(By.id("sorter"));
		Select s1 = new Select(ssDc);
		
		List<WebElement> options = s1.getOptions();
		System.out.println("Number of Options "+options.size());
		for(WebElement o:options)
		{
			System.out.println("Number of Options : "+o.getText());
		}
		
		
		//Total No. of Images
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Number of Image: " + images.size());
		for(WebElement i:images)
		{
			System.out.println("Number of Image Links : "+i.getAttribute("src"));
		}
		
		driver.close();
		
	}

}
