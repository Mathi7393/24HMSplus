package Section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreenTheWindow {

	public static void main(String[] args) {
		// Open Chrome Browser
		WebDriver driver = new ChromeDriver();

		// Full screen the browser window
		driver.manage().window().fullscreen();

		// Close the Browser
		driver.quit();

	}

}
