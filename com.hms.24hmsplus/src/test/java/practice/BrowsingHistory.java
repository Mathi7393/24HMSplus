package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowsingHistory {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.navigate().to("chrome://history/");
//		driver.get("chrome://history/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.navigate().to("file:///C:/Users/mathi/OneDrive/Desktop/Movielist.html");
		List<WebElement> movieNames = driver.findElements(By.xpath("//tbody/tr/td[2]"));
		for (WebElement name : movieNames) {
			System.out.println(name.getText());
		}
		driver.quit();
	}

}
