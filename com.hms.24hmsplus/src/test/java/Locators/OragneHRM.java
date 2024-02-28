package Locators;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OragneHRM {
	WebDriver driver=null;
	/**
	 * To Launch the Browser
	 */
	public void accessBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	/**
	 * To login to application
	 */
	public void Login() {
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(text(),Login)]")).click();
	}
	/**
	 * to logout from the application
	 */
	public void logout() {
		driver.findElement(By.cssSelector(".oxd-icon.bi-caret-down-fill.oxd-userdropdown-icon")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	/**
	 * To close the Browser
	 */
	public void closeBrowser() {
		driver.quit();
	}
	/**
	 * to get H-over message
	 * @return HOverMsg
	 */
	public ArrayList<String> getHOverMsg() {
		List<WebElement> HOverMsg = driver.findElements(By.xpath("//div[@class='orangehrm-quick-launch-heading']"));
		ArrayList<String> sl=new ArrayList<>();
		for (WebElement msg : HOverMsg) {
			sl.add(msg.getAttribute("title"));
		}
		return sl;
	}
}
