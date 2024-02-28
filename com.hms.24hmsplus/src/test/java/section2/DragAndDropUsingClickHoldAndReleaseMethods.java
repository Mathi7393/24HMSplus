package section2;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropUsingClickHoldAndReleaseMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		WebElement drag = driver.findElement(By.id("draggable"));
//		WebElement drop = driver.findElement(By.id("droppable"));
		Actions actions=new Actions(driver);
		actions.clickAndHold(drag).perform();
//		move the mouse manually to droppable
		
//		actions.moveToElement(drop).perform();
		Thread.sleep(5000);
		actions.release().perform();
	}
}
