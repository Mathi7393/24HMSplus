package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderWithDragandDropBy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone15",Keys.ENTER);
		
//		WebElement end = driver.findElement(By.cssSelector("[class='_31Kbhn WC_zGJ']"));
		Actions actions=new Actions(driver);
		WebElement end = driver.findElement(By.cssSelector("[class='_31Kbhn WC_zGJ']"));
		actions.dragAndDropBy(end, -100, 0).perform();
		Thread.sleep(5000);
		WebElement start = driver.findElement(By.cssSelector("[class='_31Kbhn _28DFQy']"));
		actions.dragAndDropBy(start, 100, 0).perform();
		
		

	}

}
