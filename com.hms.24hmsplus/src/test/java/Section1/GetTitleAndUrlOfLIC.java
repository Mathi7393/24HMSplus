package Section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrlOfLIC {

	public static void main(String[] args) throws InterruptedException {
		// Open Chrome Browser
		WebDriver driver = new ChromeDriver();

		// maximize the browser
		driver.manage().window().maximize();

		// Launch the LIC
		driver.get("https://www.licindia.in/");

		// get Title
		String Title = driver.getTitle();
		System.out.println(Title);

		// wait for 2 second
		Thread.sleep(2000);

		// get URL
		String URL = driver.getCurrentUrl();
		System.out.println(URL);

		// minimize the Browser
		driver.manage().window().minimize();

		// Close the Browser
		driver.quit();

	}

}
