package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MicTest {

	public static void main(String[] args) {
		ChromeOptions settings=new ChromeOptions();
		settings.addArguments("--use-fake-device-for-media-stream");
		settings.addArguments("--use-fake-ui-for-media-stream");
		WebDriver driver=new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mictests.com/");
		driver.findElement(By.linkText("Test Webcam")).click();
		String parID = driver.getWindowHandle();
		Set<String> allID = driver.getWindowHandles();
		for (String id : allID) {
			if (!(id.equals(parID))) {
				driver.switchTo().window(id);
			}
		}
		driver.findElement(By.id("webcam-launcher")).click();
		

	}

}
