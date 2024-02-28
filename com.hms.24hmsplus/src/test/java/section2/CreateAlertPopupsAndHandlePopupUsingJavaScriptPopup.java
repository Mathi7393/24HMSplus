package section2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAlertPopupsAndHandlePopupUsingJavaScriptPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location=arguments[0]", "https://www.amazon.in/");
		js.executeScript("alert()");
		Thread.sleep(5000);
		Alert alertpopup = driver.switchTo().alert();
		js.executeScript("alertpopup.accept()");
		Thread.sleep(5000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		js.executeScript("confirm()");
		Thread.sleep(5000);
		Alert confrimpopup = driver.switchTo().alert();
		js.executeScript("confrimpopup.dismiss();");
		driver.quit();
	}

}
