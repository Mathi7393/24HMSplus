package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToElementJavaScriptExecutorAmazon {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]","https://www.amazon.in/");
//		WebElement fb = driver.findElement(By.linkText("Facebook"));
//		js.executeScript("arguments[0].scrollIntoView()", fb);
		WebElement fb = driver.findElement(By.xpath("//h2[.='Today’s Deals']"));
		int y=fb.getLocation().getY();
//		js.executeScript("window.scrollBy(0,"+y+")", fb);
		js.executeScript("window.scrollBy(0,"+y+")");
//		js.executeScript("window.scrollBy(arguments[0].scrollIntoView())", fb);
		
	}

}
