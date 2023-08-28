package TestNG;

import org.testng.annotations.Test;

public class timout {

	
	@Test
	
	private void tc1()
	{
		System.out.println("tc1");
	}
	
	@Test(timeOut=1000)
	private void tc2()
	{
		System.out.println("tc2");
	}
	
	
	@Test
	
	private void tc3() {
		System.out.println("tc3");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
