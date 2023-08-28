package simple;

import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import sun.net.www.protocol.http.HttpURLConnection;

public class BrokenLink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {

			WebElement w = links.get(i);

			String allLinks = w.getAttribute("href");
			System.out.println(allLinks);
		}

		// create an instance for the URL

		URL url = new URL(allLinks);

		// open connection to the server

		URLConnection urlConnection = url.openConnection();

		// To send request to the server

		HttpURLConnection httpURLConnection = (HttpURLConnection) urlconnection;

		// to connect with server
		httpURLConnction.connect();

		if (httpURLConnection.getResponseCode() == 200) {
			System.out.println(allLinks + "-" + httpURLConnction.getResponseMessage());
		} else {
			System.out.println(allLinks + " - " + httpURLConnction.getResponseCode() + "-"
					+ httpURLConnction.getResponseMessage());

		}

	}

}
