package simple;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnotationTestng {
	
	@Test
	
	private void tc1() {
		System.out.println("tc1");
	}
	
	
	@BeforeClass
	
	void beforeClass()
	{
		System.out.println("Before class");
	}
			
	
	@BeforeMethod
	
	void beforeMethod() {
		System.out.println("before Method");
	}
	
	
	@AfterClass
	
  void afterClass() {
		System.out.println("after class");
	}
	
	@AfterMethod
	void afterMethod(){
		System.out.println("after method");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
