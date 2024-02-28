package Section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeICICIBank {

	public static void main(String[] args) {
		// Open Chrome Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Open ICICI Bank
		driver.get("https://www.icicibank.com/");

		// get Size of window
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);

		// Close the Browser
		driver.quit();
	}

}
