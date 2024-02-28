package Section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseNavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		// Open Chrome Browser
		WebDriver driver = new ChromeDriver();

		// Maximize browser window
		driver.manage().window().maximize();

		// Access Amazon Application
		driver.get("https://www.amazon.in/");

		// wait for Two Seconds
		Thread.sleep(2000);

		// Access Youtube
		driver.get("https://www.youtube.com/");

		// wait for Two Seconds
		Thread.sleep(2000);

		// go back to Amazon
		driver.navigate().back();

		// wait for Two Seconds
		Thread.sleep(2000);

		// forward to youtube
		driver.navigate().forward();

		// wait for Two Seconds
		Thread.sleep(2000);

		// refresh
		driver.navigate().refresh();

		// wait for Two Seconds
		Thread.sleep(2000);

		// close the Browser
		driver.quit();

	}

}
