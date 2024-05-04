package SeleniumAdvance;

import org.testng.annotations.Test;

public class PriorityDemo {
	
	@Test(priority = 0)
	public void login()
	{
		System.out.println("Login Method");
	}
	
	@Test(priority = 1)
	public void homePage()
	{
		System.out.println("Home Page is Open");
	}
	
	@Test(priority = 5)
	public void payment()
	{
		System.out.println("Payment Method");
	}
	
	@Test(priority = -1)
	public void logOut()
	{
		System.out.println("logOut Method");
	}

}
