package Section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleOfWebPage {

	public static void main(String[] args) throws InterruptedException {
		// Launch Chrome Browser
		WebDriver driver = new ChromeDriver();

		// maximize the browser
		driver.manage().window().maximize();

		// wait for 2 seconds
		Thread.sleep(2000);

		// minize the browser
		driver.manage().window().minimize();

		// wait for 2 seconds
		Thread.sleep(2000);

		// maximize the browser
		driver.manage().window().maximize();

		// Launch Make my trip
		driver.get("https://www.makemytrip.com/");
		
		//Get Title of Web Page
		String title = driver.getTitle();
		System.out.println(title);

		// Close the Browser
		driver.quit();

	}

}
