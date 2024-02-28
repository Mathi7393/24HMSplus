package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleJavaScriptPopUpUsingJavascriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");
		driver.findElement(By.linkText("CONTINUE")).click();
		Alert alert = driver.switchTo().alert();
//		alert.accept();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("accept()");
		driver.findElement(By.name("fldLoginUserId")).sendKeys("Mathi");

	}

}
