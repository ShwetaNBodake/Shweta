package simple;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();

		// To get frame Count

		List<WebElement> totalCount = driver.findElements(By.tagName("iframe"));

		int s = totalCount.size();
		System.out.println("Total frame Count" + s);

		Thread.sleep(3000);

		driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("Shweta");

	}

}
