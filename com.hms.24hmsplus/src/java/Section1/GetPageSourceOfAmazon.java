package Section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceOfAmazon {

	public static void main(String[] args) {
		// Open Chrome Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize browser window
		driver.manage().window().maximize();
		
		//Access Amazon Application 
		driver.get("https://www.amazon.in/");
		
		//Get Front end page source and Display
		System.out.println(driver.getPageSource());
		
		//close the browser
		driver.quit();

	}

}
