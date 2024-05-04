package SeleniumAdvance;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test
	public void login()
	{
		System.out.println("Login Method");
	}
	
	@Test(dependsOnMethods = {"Login"})
	public void homePage()
	{
		System.out.println("Home Page is Open");
	}
	
	@Test(dependsOnMethods = {"login" , "homePage"})
	public void payment()
	{
		System.out.println("Payment Method");
	}
	
	@Test(dependsOnMethods = {"payment"})
	public void logOut()
	{
		System.out.println("logOut Method");
	}

}
