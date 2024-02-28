package Section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox 
{

	public static void main(String[] args) throws InterruptedException
	{
		//to launch the firefox browser
		WebDriver driver = new FirefoxDriver();
		
		//to give time delay for thread
		Thread.sleep(3000);
		
		//optimized way to maximize the window of browser
		driver.manage().window().maximize();
	}

}
