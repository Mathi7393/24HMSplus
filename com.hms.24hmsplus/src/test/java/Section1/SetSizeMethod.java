package Section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
		// Open Chrome Browser
		WebDriver driver = new ChromeDriver();

		// creater object of dimension
		Dimension d = new Dimension(500, 500);

		// set the size of the browser window
		driver.manage().window().setSize(d);

		// wait for two seconds
		Thread.sleep(2000);

		// Close the Browser
		driver.quit();

	}

}
