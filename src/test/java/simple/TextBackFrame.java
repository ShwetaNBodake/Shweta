package simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBackFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("Shweta");

		Thread.sleep(3000);

		driver.switchTo().parentFrame();
		driver.findElement(By.className("frmTextBox")).sendKeys("Besant Technologies");

	}

}
