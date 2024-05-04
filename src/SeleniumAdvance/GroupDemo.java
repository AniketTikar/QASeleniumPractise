package SeleniumAdvance;

import org.testng.annotations.Test;

@Test(groups = "User-Registeration")
public class GroupDemo {
	

	@Test(priority = 0,groups = "regression")
	public void login()
	{
		System.out.println("Login Method");
	}
	
	@Test(priority = 1,groups = {"regression" , "BVT"})
	public void homePage()
	{
		System.out.println("Home Page is Open");
	}
	
	@Test(priority = 5, groups = "BVT")
	public void payment()
	{
		System.out.println("Payment Method");
	}
	
	@Test(priority = -1, groups = "regression")
	public void logOut()
	{
		System.out.println("logOut Method");
	}

}
