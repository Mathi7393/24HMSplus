package Section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFullScreen {

	public static void main(String[] args) throws InterruptedException {
		// Open Chrome Browser
		WebDriver driver = new ChromeDriver();

		// access Amazon application
		driver.get("https://www.amazon.in/");

		// wait for two seconds
		Thread.sleep(2000);

		// Maximize the browser
		driver.manage().window().maximize();

		// minimize the browser
		driver.manage().window().minimize();

		// full screen the browser window
		driver.manage().window().fullscreen();

		// minimize the browser
		driver.manage().window().minimize();

		// get the title of web page
		String title = driver.getTitle();
		System.out.println(title);

		// get the URL of the web page
		String url = driver.getCurrentUrl();
		System.out.println(url);

		// close the browser
		driver.quit();
	}

}
