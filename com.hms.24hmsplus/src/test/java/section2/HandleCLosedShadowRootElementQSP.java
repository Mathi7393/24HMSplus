package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCLosedShadowRootElementQSP {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]", "https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[.='Shadow Root Elements']")).click();
		driver.findElement(By.xpath("//section[.='Shadow Root']")).click();
		driver.findElement(By.linkText("Close Shadow Root")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@class='pe-5']")).sendKeys(Keys.TAB);
		driver.findElement(By.cssSelector("form[class='pe-5']"));
		
	}

}
