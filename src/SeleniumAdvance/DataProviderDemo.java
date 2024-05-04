package SeleniumAdvance;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@DataProvider(name = "cred")
	public Object[][] dp()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0] = "E101";
		data[0][1] = "p@1";
		
		data[1][0] = "E102";
		data[1][1] = "p@2";
		
		data[2][0] = "E103";
		data[2][1] = "p@3";
		
		return data;
	}
	
	@DataProvider(name = "credLog")
	public Object[][] dp2()
	{
		return new Object[][] {{"Aniket",25,"Employee"},{"Sanket",24,"Stuudent"}};
	}
	
	
	@Test(dataProvider = "cred")
	public void test(String a,String b)
	{
		System.out.println(a+" "+b);
	}
	
	@Test(dataProvider  = "credLog")
	public void test1(String p, int q,String r)
	{
		System.out.println(p+" "+q+" "+r);
	}

}
