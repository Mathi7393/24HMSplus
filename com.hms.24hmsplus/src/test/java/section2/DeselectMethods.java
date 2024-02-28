package section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///E:/Selenium/MoviesMultiselect.html");
		driver.findElement(By.id("Movies"));
		WebElement movielist = driver.findElement(By.id("Movies"));
		Select se=new Select(movielist);
		System.out.println(se.isMultiple());
		List<WebElement> allMovies = se.getOptions();
		for (WebElement movie : allMovies) {
			movie.click();
		}
		Thread.sleep(2000);
		se.deselectByIndex(0);
		Thread.sleep(2000);
		se.deselectByValue("KGF");
		Thread.sleep(2000);
		se.deselectByVisibleText("LEO");
		Thread.sleep(2000);
		se.deselectAll();
		

	}

}
