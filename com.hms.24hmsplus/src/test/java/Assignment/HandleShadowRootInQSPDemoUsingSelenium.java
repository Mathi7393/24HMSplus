package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleShadowRootInQSPDemoUsingSelenium {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[.='Shadow Root Elements']")).click();
		driver.findElement(By.xpath("//section[.='Shadow Root']")).click();
		driver.findElement(By.linkText("Open Shadow Root")).click();
		WebElement parele = driver.findElement(By.cssSelector("form[class='pe-5']>div"));
		SearchContext shadow = parele.getShadowRoot();
		shadow.findElement(By.cssSelector("input[placeholder='Enter your username']")).sendKeys("MAthi");
		WebElement parele1 = driver.findElement(By.cssSelector("form[class='pe-5']>div+div"));
		SearchContext shadow2 = parele1.getShadowRoot();
		shadow2.findElement(By.cssSelector("input[placeholder='Enter your password']")).sendKeys("MAthi");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

}
