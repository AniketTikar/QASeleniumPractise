package SeleniumAdvance;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation
{
	@BeforeSuite
	public void beforeSuiteMethod()
	{
		System.out.println("Before Suite Method");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test Method");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class Method");
	}
	
	@Test
	public void test()
	{
		System.out.println("Test Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class Method");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test Method");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite Method");
	}

}
