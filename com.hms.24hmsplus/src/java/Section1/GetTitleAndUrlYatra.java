package Section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitleAndUrlYatra {

	public static void main(String[] args) {
		// Open Firefox Browser
		WebDriver driver = new FirefoxDriver();

		// maximize the browser
		driver.manage().window().maximize();

		// Launch the Yatra
		driver.get("https://www.yatra.com/");

		// get Title
		System.out.println(driver.getTitle());
		
		//get URL
		String URL=driver.getCurrentUrl();
		System.out.println(URL);

		// Close the Browser
		driver.quit();

	}

}
