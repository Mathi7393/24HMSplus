package section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessLICandAccessHDFCinNewWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.licindia.in/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.hdfcbank.com/");
		Set<String> allwin = driver.getWindowHandles();
		for (String id : allwin) {
			System.out.println(driver.switchTo().window(id).getTitle());
		}
		driver.quit();

	}

}
