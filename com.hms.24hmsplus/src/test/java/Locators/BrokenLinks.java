package Locators;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.amazon.in/");
		List<WebElement> allLink = driver.findElements(By.xpath("//a"));
		ArrayList<String> brokenLinks = new ArrayList<String>();
		for (WebElement r : allLink) {
			String links = r.getAttribute("href");
			int statuscode = 0;
			try {
				// convert the link into URL
				URL url = new URL(links);

				// Open a connection to server
				URLConnection urlcon = url.openConnection();

				// connect to server using http.url.connection
				HttpURLConnection httpurl = (HttpURLConnection) urlcon;

				// get the Status Code
				statuscode = httpurl.getResponseCode();
				if (statuscode >= 400) {
					brokenLinks.add(links + "" + statuscode);
				}
			} catch (Exception e) {
				continue;
			}
		}
		System.out.println(brokenLinks + "\n");
	}

}
