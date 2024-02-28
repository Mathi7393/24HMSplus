package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatePracticeAutomation {
	WebDriver driver = null;

	public void AccessBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	public void login() {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.className("btn")).click();

	}
	public void logout() {
		driver.findElement(By.linkText("Log out")).click();
	}
	public void CloseBrowser() {
		driver.quit();
	}

}
