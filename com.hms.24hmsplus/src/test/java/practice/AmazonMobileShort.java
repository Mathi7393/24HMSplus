package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class AmazonMobileShort {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.linkText("Mobiles")).click();
		WebElement lapAss = driver.findElement(By.partialLinkText("Laptops & Accessories"));
		Actions actions=new Actions(driver);
		actions.moveToElement(lapAss).perform();
		driver.findElement(By.linkText("Dell")).click();
//		WebElement sortby = 
		driver.findElement(By.cssSelector("[class='a-button-text a-declarative']")).click();
		Robot r=new Robot();
		for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File src=new File("./ScreenShot/amz.png");
		Files.copy(temp, src);
	}

}
