package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSAutomationPractice {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
//		String ele1 = driver.findElement(By.cssSelector("p.class1")).getText();
		String ele1 = driver.findElement(By.cssSelector("p[class*='class']")).getText();
		System.out.println(ele1);
		driver.quit();
	}

}
