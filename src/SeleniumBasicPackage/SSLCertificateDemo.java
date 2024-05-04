package SeleniumBasicPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class SSLCertificateDemo {
	
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aniket_Testing\\Chrome_Driver_Latest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		
		//Global Level
		DesiredCapabilities dc= new DesiredCapabilities();
		//dc.setAcceptInsecureCerts(true);
	
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.UNHANDLED_PROMPT_BEHAVIOUR, true);
		
		ChromeOptions options = new ChromeOptions();
		options.merge(dc);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		
		
	}

}
