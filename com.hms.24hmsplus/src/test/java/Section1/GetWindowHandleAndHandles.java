package Section1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleAndHandles {

	public static void main(String[] args) {
		// Open Chrome Browser
		WebDriver driver = new ChromeDriver();

		// Maximize browser window
		driver.manage().window().maximize();

		// Access Amazon Application
		driver.get("https://www.amazon.in/");

		// get title of web Page
		System.out.println(driver.getTitle());

		// Get Front end page source and Display
		System.out.println(driver.getPageSource());
		
		//get Parent window ID
		String parentID = driver.getWindowHandle();
		System.out.println(parentID);

		//get all window IDs
		Set<String> allIds = driver.getWindowHandles();
		System.out.println(allIds);
		
		// close the browser
		driver.quit();
	}

}
