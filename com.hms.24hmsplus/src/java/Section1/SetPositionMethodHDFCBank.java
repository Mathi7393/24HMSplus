package Section1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetPositionMethodHDFCBank {

	public static void main(String[] args) throws InterruptedException {
		// Open Firefox Browser
		WebDriver driver = new FirefoxDriver();

		// open HDFC bank
		driver.get("https://www.hdfcbank.com/");

		// Maximize the browser
		driver.manage().window().maximize();

		// wait for 3 seconds
		Thread.sleep(3000);

		// create Point type Object
		Point p = new Point(100, 100);

		// Set position Of window
		driver.manage().window().setPosition(p);

		// wait for 3 seconds
		Thread.sleep(3000);

		// Set position Of window
		driver.manage().window().setPosition(new Point(200, 200));

		// Close the Browser
		driver.quit();

	}

}
