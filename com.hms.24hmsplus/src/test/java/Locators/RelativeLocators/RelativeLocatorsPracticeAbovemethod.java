package Locators.RelativeLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocatorsPracticeAbovemethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement conPWD = driver.findElement(By.id("ConfirmPassword"));
//		driver.findElement(RelativeLocator.with(By.tagName("input")).above(conPWD)).sendKeys("password");
		driver.findElement(with(By.tagName("input")).above(conPWD)).sendKeys("password");
		
	}
}
