package section2;

import java.awt.AWTException;
import java.awt.Button;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateNewTab {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
//		Actions actions=new Actions(driver);
		Robot r=new Robot();
		r.mouseMove(310,195);
		Thread.sleep(3000);
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(3000);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//		actions.click().perform();
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.get("https://www.flipkart.com/");
//		driver.switchTo().newWindow(WindowType.TAB);
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("open('https://youtube.com/')");
		
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_T);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_T);
//		driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL+"t");
		
		
		

	}

}
