package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BuildMethodInActionClassVtiger {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("password");
		driver.findElement(By.id("submitButton")).click();
		WebElement adimg = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		WebElement signoutLink = driver.findElement(By.xpath("//a[.='Sign Out']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(adimg).click(signoutLink).build().perform();
	}

}
