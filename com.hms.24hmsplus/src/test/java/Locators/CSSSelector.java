package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://practicetestautomation.com/practice-test-login/");
//		driver.findElement(By.cssSelector("[name='username']")).sendKeys("student");
		driver.findElement(By.cssSelector("input#username")).sendKeys("student");//css id
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("Password123");
//		driver.findElement(By.cssSelector("[id*='sub']")).click();//css contains
		driver.findElement(By.cssSelector(".btn")).click();//css class name
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
