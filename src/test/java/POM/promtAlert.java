package POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class promtAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		Thread.sleep(2000);

	WebElement pa= driver.findElement(By.xpath("//*[@id='promtButton']"));
	pa.click();
	
	Alert p = driver.switchTo().alert();
	String s= p.getText();
	System.out.println(s);
	p.sendKeys("Shweta");
	p.accept();



	}

}
