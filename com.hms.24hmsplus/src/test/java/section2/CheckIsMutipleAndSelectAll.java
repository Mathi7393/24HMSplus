package section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckIsMutipleAndSelectAll {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("E:/Selenium/MoviesMultiselect.html");
		WebElement movielist = driver.findElement(By.id("Movies"));
		Select se=new Select(movielist);
		System.out.println(se.isMultiple());
		List<WebElement> allMovies = se.getOptions();
		for (WebElement movie : allMovies) {
			movie.click();
		}
//		for (int i = 1; i <= 4; i++) {
//			se.selectByIndex(i);
//		}
	}

}
