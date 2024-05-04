package Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String[] args) throws IOException {
		
		Properties properties = new Properties();
		
		FileInputStream fis = new FileInputStream("D:\\Aniket_Testing\\Automation_Testing_Selemiun_WebDriver\\Automation_Selenium_Practise\\TestData.properties");
		
		properties.load(fis);
		
		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("url"));
		
		FileOutputStream fos = new  FileOutputStream("D:\\\\Aniket_Testing\\\\Automation_Testing_Selemiun_WebDriver\\\\Automation_Selenium_Practise\\\\TestData.properties");
		
		properties.setProperty("Test_Data", "23456");
		properties.store(fos, "This is TC 2");
	}

}
