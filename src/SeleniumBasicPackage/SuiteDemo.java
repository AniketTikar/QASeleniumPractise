package SeleniumBasicPackage;



import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.testng.annotations.Test;



@RunWith(Suite.class)

@SuiteClasses({SeleniumBasicPackage.AlertDemo.class,SeleniumBasicPackage.DragAndDrop.class})
public class SuiteDemo {
	
	@Test
	public void test()
	{
		System.out.println("In Suite Class");
		
	}

}
