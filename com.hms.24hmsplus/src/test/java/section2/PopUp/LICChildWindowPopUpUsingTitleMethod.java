package section2.PopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LICChildWindowPopUpUsingTitleMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location=arguments[0]", "https://www.licindia.in/");
		driver.findElement(By.partialLinkText("Login")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(5000);
		Set<String> allIDs = driver.getWindowHandles();
		for (String id : allIDs) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
			System.out.println(driver.getTitle().equals("Life Insurance Corporation of India"));
			if (driver.getTitle().equals("Life Insurance Corporation of India")) {
				break;
			}
		}
		driver.findElement(By.name("userId")).sendKeys("Mathi");
	}

}
