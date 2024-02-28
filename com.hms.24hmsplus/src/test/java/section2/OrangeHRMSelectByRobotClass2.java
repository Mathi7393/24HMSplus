package section2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMSelectByRobotClass2 {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin",Keys.TAB,"admin123",Keys.TAB,Keys.ENTER);
		driver.findElement(By.xpath("//span[.='Admin']")).click();
		WebElement drop = driver.findElement(By.xpath("//label[.='User Role']/ancestor::div[@class=\"oxd-input-group__label-wrapper\"]/following-sibling::div[@class=\"\"]/descendant::div[@class=\"oxd-select-text--after\"]/descendant::i"));
		drop.click();
//		((JavascriptExecutor)driver).executeScript("arguments[0].text() = 'Admin'", driver.findElement(By.xpath("//label[.='User Role']/parent::div/following-sibling::div/descendant::div[@class='oxd-select-text-input']")));
//		drop.sendKeys(Keys.ENTER);
//		Actions actions=new Actions(driver);
//		actions.sendKeys(Keys.DOWN,Keys.ENTER).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}
