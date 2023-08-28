package adactinHotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin {
	@Test

	private void Login() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

		WebElement usern = driver.findElement(By.id("username"));
		usern.sendKeys("ShwetaNBodake");

		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("123456");

		//Thread.sleep(3000);
		WebElement login = driver.findElement(By.id("login"));
		login.click();

		//Thread.sleep(3000);

		WebElement txt = driver.findElement(By.className("login_title"));

		String text = txt.getText();
		System.out.println(text);
		
		WebElement loc = driver.findElement(By.id("location"));
		Select s1 = new Select(loc);
		s1.selectByVisibleText("Paris");
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s2 = new Select(hotel);
		s2.selectByIndex(4);
		
		WebElement rmtype= driver.findElement(By.id("room_type"));
		Select s3 = new Select(rmtype);
		s3.selectByValue("Super Deluxe");
				
		WebElement rooms = driver.findElement(By.id("room_nos"));
		Select s4 = new Select(rooms);
		s4.selectByValue("2");
		
		driver.findElement(By.id("datepick_in")).sendKeys("11/08/2023");
		
		
		driver.findElement(By.id("datepick_out")).sendKeys("18/08/2023");
		
		
		WebElement adlrm = driver.findElement(By.id("adult_room"));
		Select s5 = new Select(adlrm);
		s5.selectByIndex(2);
		
		WebElement cdlrm = driver.findElement(By.id("child_room"));
		Select s6 = new Select(cdlrm);
		s6.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.id("Submit")).click();
		
		
		WebElement text2 = driver.findElement(By.xpath("//td[text()='Select Hotel ']"));
	
		String textele = text2.getText();
		System.out.println(textele);
		
		
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("first_name")).sendKeys("Shweta");
		
		driver.findElement(By.id("last_name")).sendKeys("B");
		driver.findElement(By.id("address")).sendKeys("bengaluru");
		driver.findElement(By.id("cc_num")).sendKeys("0123456789123456");
		
		WebElement dataText = driver.findElement(By.xpath("//*[text()='Use 16 digit Dummy Data']"));
		String d= dataText.getText();
		System.out.println(d);
		
		
		WebElement card = driver.findElement(By.id("cc_type"));
		Select s7 = new Select(card);
		s7.selectByIndex(2);
		
		WebElement exmonth= driver.findElement(By.id("cc_exp_month"));
		Select s8 = new Select(exmonth);
		s8.selectByValue("9");
		
		WebElement exyr= driver.findElement(By.id("cc_exp_year"));
		Select s9 = new Select(exyr);
		s9.selectByValue("2030");
		
		driver.findElement(By.id("cc_cvv")).sendKeys("1234");
		
		driver.findElement(By.id("book_now")).click();
		
		String odernum= driver.findElement(By.xpath("//input[@id='order_no']")).getAttribute("Value").toString();
 
		System.out.println(odernum);
		
		
		driver.findElement(By.id("logout")).click();
	
		
		
		

	}

}
