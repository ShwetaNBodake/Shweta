package TestNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tabHandle {
	@Test

	private void demoHandle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		 Thread.sleep(3000);
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		driver.findElement(By.id("newWindowBtn")).click();		
		
		

		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println(allWindowsId);

		for (String allWindows : allWindowsId) {
			
			if (!allWindows.equals(parentWindow)) {
				driver.switchTo().window(allWindows);
				driver.findElement(By.id("firstName")).sendKeys("Shweta");
				Thread.sleep(3000);
				driver.close();
			}

		}

		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("name")).sendKeys("Selenium");
		
		
		
		
	}
	

}