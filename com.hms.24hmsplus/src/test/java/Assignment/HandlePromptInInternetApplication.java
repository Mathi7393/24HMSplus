package Assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePromptInInternetApplication {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location=arguments[0]", "https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
		Alert prompt = driver.switchTo().alert();
//		prompt.sendKeys("yes");
//		prompt.accept();
		js.executeScript("yes",prompt);
		prompt.accept();
	}

}
