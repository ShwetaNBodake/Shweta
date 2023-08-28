package DataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoSoftAssert {
	@Test

	public void tc1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, "https://www.facebook.com/" ,"Title missmatched");
		System.out.println("FB page launched");
	}

	public void tc2() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, "https://www.google.com/");
		System.out.println("google page is launched");

	}

}
