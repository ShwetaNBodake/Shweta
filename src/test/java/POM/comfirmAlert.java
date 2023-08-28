package POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class comfirmAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();

		Alert c = driver.switchTo().alert();
		c.dismiss();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		c.accept();
		Thread.sleep(5000);

	}

}
