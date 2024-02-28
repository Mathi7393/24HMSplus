package Section1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetPositionHDFCBank {

	public static void main(String[] args) throws InterruptedException {
		// Open Firefox Browser
		WebDriver driver = new FirefoxDriver();

		// open HDFC bank
		driver.get("https://www.hdfcbank.com/");

		// wait for 3 seconds
		Thread.sleep(3000);

		// Set position Of window
		Point position = driver.manage().window().getPosition();
		System.out.println(position);

		// Close the Browser
		driver.quit();

	}

}
