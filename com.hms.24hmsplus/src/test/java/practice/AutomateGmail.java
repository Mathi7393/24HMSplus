package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AutomateGmail {

	public static void main(String[] args) {
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--incognito");
//		WebDriver driver = new ChromeDriver(options);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.google.com");
//		driver.findElement(By.xpath("//span[.='Sign in']")).click();
//		driver.findElement(By.id("identifierId")).sendKeys("9688603286");
//		driver.findElement(By.xpath("//span[.='Next']")).click();
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.xpath("(//span[text()='Create an account'])[1]")).click();
		driver.findElement(By.id("firstName")).sendKeys("mathi");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebElement month = driver.findElement(By.id("month"));
		Select mdd=new Select(month);
		mdd.selectByVisibleText("March");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\"#day\").value=\"24\";");
		js.executeScript("document.querySelector(\"#year\").value=\"1997\";");
		WebElement gender = driver.findElement(By.id("gender"));
		Select gendd=new Select(gender);
		gendd.selectByValue("1");
		driver.findElement(By.xpath("//span[.='Next']")).click();
	}

}
