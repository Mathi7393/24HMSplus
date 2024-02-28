package Section1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_chrome 
{

	public static void main(String[] args) throws InterruptedException
	{
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		
		//to give time delay for thread to maximize the browser
		Thread.sleep(2500);

		//traditional way to maximize the window of browser
		Options mng=driver.manage();
		Window win = mng.window();
		win.maximize();
		
		//optimized way to maximize the window of browser
		driver.manage().window().maximize();
		
		//to give time delay for thread to minimize the browser
		Thread.sleep(2500);
		
		//optimized way to minimize the window of browser
		driver.manage().window().minimize();

	}

}
