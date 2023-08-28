package adactinHotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsExecuter {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		
		
		WebElement user = driver.findElement(By.id("username"));
		WebElement pass = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("login"));
		
		JavascriptExecuter js = (JavascriptExecuter)driver;
		
		//sendKeys
		js.ExecuterScript("arguments[0].setAttribute('value','ShwetaBodake')",user);
		
		//getAttribute
		Object usertext = js.ExecuterScript("return arguments[0].getAttribute('value')",user);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
