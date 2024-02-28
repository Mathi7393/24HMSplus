package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleShadowRootElementInBooksAppUSingSelenium {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://books-pwakit.appspot.com/explore?9=");
		WebElement parele = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']"));
		SearchContext shadow = parele.getShadowRoot();
		shadow.findElement(By.cssSelector("app-header[effects='waterfall'] input[id='input']")).sendKeys("MAthi");
	
	}

}
