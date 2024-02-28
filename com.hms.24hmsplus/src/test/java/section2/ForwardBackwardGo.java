package section2;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForwardBackwardGo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.location=arguments[0]", "https://www.amazon.in/");
		Thread.sleep(2000);
		js.executeScript("window.location=arguments[0]", "https://www.flipkart.com/");
		Thread.sleep(2000);
		js.executeScript("history.back(0);");
		Thread.sleep(2000);
		js.executeScript("history.forward(0);");
		Thread.sleep(2000);
		js.executeScript("history.go(0);");
	}

}
