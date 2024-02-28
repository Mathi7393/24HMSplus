package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(6000);
		Actions actions=new Actions(driver);
		actions.click().perform();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span/descendant::span[text()='Flights']")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("li[data-cy='oneWayTrip']")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("label[for='fromCity']")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("input[placeholder='From']")).sendKeys("salem");
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("input[placeholder='From']")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("label[for='toCity']")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("input[placeholder='To']")).sendKeys("Bengaluru");
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("input[placeholder='To']")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(10000);
//		driver.findElement(By.xpath("//label[@for='departure']")).click();
		for (;;) {
			try {
				driver.findElement(By.xpath(
						"//div[text()='January 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='11']"))
						.click();
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@class='bgProperties  overlayCrossIcon icon20']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//div[@class='listingCard  appendBottom5'])[position()=1]/descendant::span[text()='View Prices']")).click();
		Thread.sleep(10000);
		String parID = driver.getWindowHandle();
		driver.findElement(By.xpath("//p[text()='Saver']/ancestor::div[@class='make_flex ']/descendant::button[text()='Book Now']")).click();
		Set<String> allID = driver.getWindowHandles();
		for (String ID : allID) {
			if (!(ID.equals(parID))) {
				driver.switchTo().window(ID);
			}
		}
		driver.findElement(By.xpath("//b[text()='No,']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[.='+ ADD NEW ADULT']")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("[placeholder='First & Middle Name']")).sendKeys("Mathi");
		driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("Alagan");
		driver.findElement(By.xpath("//input[@value='MALE']")).click();
		
	}
}
