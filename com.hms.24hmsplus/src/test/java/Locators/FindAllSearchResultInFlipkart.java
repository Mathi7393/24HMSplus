package Locators;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllSearchResultInFlipkart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		HashMap<String, String> hm=new HashMap<>();
		driver.findElement(By.cssSelector("[name='q']")).sendKeys("iphone 15");
		driver.findElement(By.cssSelector("[class*='iLD']")).click();
		List<WebElement> list = driver.findElements(By.cssSelector("[class*='rR']"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_25b18c']"));
		int count=list.size();
		for (int i = 0; i < count; i++) {
			hm.put("\n"+list.get(i).getText(), price.get(i).getText());
		}
		System.out.println(hm);
//		for (WebElement element : list) {
//			System.out.println(element.getText());
//		}
		driver.quit();
	}

}
