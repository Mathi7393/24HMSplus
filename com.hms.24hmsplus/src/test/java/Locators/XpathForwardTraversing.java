package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathForwardTraversing {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
//		driver.findElement(By.xpath("//div[@class='nav-search-field ']/input[@class='nav-input nav-progressive-attribute']")).sendKeys("watch",Keys.ENTER);
//		driver.findElement(By.xpath("//div[@class='nav-search-field ']/child::input[@class='nav-input nav-progressive-attribute']")).sendKeys("watch",Keys.ENTER);
		driver.findElement(By.xpath("//form[@id='nav-search-bar-form']/descendant::input[@id='twotabsearchtextbox']")).sendKeys("watch",Keys.ENTER);
//		driver.get("https://www.icc-cricket.com/rankings/mens/overview");
//		driver.findElement(By.xpath("//nav[@id='']/descendant::button[contains(text(),'Rankings')]")).click();
	}

}
