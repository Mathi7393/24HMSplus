package section2.PopUp;

import java.sql.Driver;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LICChildWindowPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location=arguments[0]", "https://www.licindia.in/");
		driver.findElement(By.partialLinkText("Login")).click();
		String parID = driver.getWindowHandle();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Set<String> allIDs = driver.getWindowHandles();
		for (String id : allIDs) {
			if (!(id.equals(parID))) {
//				System.out.println("ok");
				driver.switchTo().window(id);
			}
		}
		driver.findElement(By.name("userId")).sendKeys("Mathi");
	}

}
