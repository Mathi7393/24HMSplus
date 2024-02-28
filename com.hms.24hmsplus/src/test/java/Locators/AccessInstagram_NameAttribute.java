package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessInstagram_NameAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		WebElement un = driver.findElement(By.name("username"));
		un.sendKeys("8428818235");
		Thread.sleep(5000);
		WebElement pw = driver.findElement(By.name("password"));
		pw.sendKeys("Mathi@7393");
		pw.submit();
		Thread.sleep(5000);
		driver.close();

	}

}
