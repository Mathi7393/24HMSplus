package Section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAmazon {

	public static void main(String[] args) throws InterruptedException {
		// Open Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		// wait for 2 seconds
		Thread.sleep(2000);
		
		// maximize the browser
		driver.manage().window().maximize();
		
		// wait for 2 seconds
		Thread.sleep(2000);
		
		// Launch Amazon Application
		driver.get("https://www.amazon.in/");
		
	}

}
