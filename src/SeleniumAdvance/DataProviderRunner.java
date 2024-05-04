package SeleniumAdvance;

import org.testng.annotations.Test;

public class DataProviderRunner {
	
	@Test(dataProvider = "cred" , dataProviderClass = DataProviderData.class)
	public void test(String a,String b)
	{
		System.out.println(a+" "+b);
	}
	
	@Test(dataProvider  = "credLog" , dataProviderClass = DataProviderData.class
			)
	public void test1(String p, int q,String r)
	{
		System.out.println(p+" "+q+" "+r);
	}

}
