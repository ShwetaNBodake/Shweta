package simple;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonCart {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		// driver.manage().window().maximize();

		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

		searchbox.sendKeys("iphone 14");

		Thread.sleep(3000);
		Robot r = new Robot();
		for (int i = 0; i <= 4; i++) {

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//*[text()='Apple iPhone 14 (128 GB) - Blue']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("add-to-cart-button")).click();
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println(allWindowsId);
		
		
		
		
		
		
		
		

	}
}