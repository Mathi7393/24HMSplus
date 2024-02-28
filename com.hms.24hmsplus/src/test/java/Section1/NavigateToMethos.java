package Section1;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToMethos {

	public static void main(String[] args) throws Throwable {
		// Open Chrome Browser
		WebDriver driver = new ChromeDriver();

		// Maximize browser window
		driver.manage().window().maximize();

		// navigate to Amazon
		driver.navigate().to("https://www.amazon.in/");

		// navigate to YouTube
		URL url = new URL("https://www.flipkart.com/");
		driver.navigate().to(url);

		// close the Browser
		driver.quit();
	}

}
