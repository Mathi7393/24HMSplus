package section2.PopUp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleNotificationPopUp {

	public static void main(String[] args) {
		ChromeOptions settings=new ChromeOptions();
		settings.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.yatra.com/");
	}

}
