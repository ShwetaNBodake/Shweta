package simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.Base;

public class SampleBase extends Base {
	public static void main(String[] args) {
		browserLaunch("https://www.facebook.com/");

		maximize();

		printUrl();

		printTitle();

		WebElement user = driver.findElement(By.id("email"));

		sendValue(user, "Besanttechnologies");

		WebElement pass = driver.findElement(By.id("pass"));

		sendValue(pass, "567890");

		quitBrowser();

	}

}
