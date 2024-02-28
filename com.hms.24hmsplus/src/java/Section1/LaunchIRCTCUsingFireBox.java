package Section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchIRCTCUsingFireBox {

	public static void main(String[] args) throws InterruptedException {
		// Launch Firefox Browser
		WebDriver driver = new FirefoxDriver();
//		WebDriver driver =new ChromeDriver();

		// wait for 2 seconds
		Thread.sleep(2000);

		// maximize the browser
		driver.manage().window().maximize();

		// minize the browser
		driver.manage().window().minimize();

		// maximize the browser
		driver.manage().window().maximize();

		// wait for 2 seconds
		Thread.sleep(2000);

		// Launch IRCTC application
		driver.get("https://www.irctc.co.in/");
	}

}
