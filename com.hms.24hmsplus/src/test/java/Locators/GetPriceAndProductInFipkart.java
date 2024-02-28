package Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPriceAndProductInFipkart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.cssSelector("[name='q']")).sendKeys("iphone 15");
		driver.findElement(By.cssSelector("[class*='iLD']")).click();
		List<WebElement> list = driver.findElements(By.cssSelector("[class*='rR']"));
		List<WebElement> price = driver.findElements(By.xpath("//div[contains(@class,'WHN')]"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText()+" Price = "+price.get(i).getText());
		}
		driver.quit();
	}

}
