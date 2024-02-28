package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FireFlink {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.fireflink.com/");
		WebElement signinEle = driver.findElement(By.xpath("//a[text()='Sign In']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", signinEle);
		driver.findElement(By.cssSelector("#mui-1")).sendKeys("mathiyazhaganrmdk@gmail.com");
		driver.findElement(By.cssSelector("#mui-2")).sendKeys("Password@123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(5000);
		List<WebElement> allProjects = driver.findElements(By.cssSelector(".project-row.border-none.h-10 a[href='']"));
		for (WebElement project : allProjects) {
			System.out.println(project.getText());
			if (project.getText().equals("Mathiyazhagan_Instagram")) {
				project.click();
				break;
			}
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
