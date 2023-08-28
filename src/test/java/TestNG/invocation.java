package TestNG;

import org.testng.annotations.Test;

public class invocation {
	@Test(priority = 2)

	private void tc1() {
		System.out.println("tc1");
	}

	@Test(invocationCount=5)

	private void tc2() {
		System.out.println("tc2");
	}

	@Test(priority = 1)

	private void tc3() {
		System.out.println("tc3");

	}


}
