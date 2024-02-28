package section2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMKeysClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
//		driver.findElement(By.name("username")).sendKeys("Admin",Keys.TAB,"admin123",Keys.TAB,Keys.ENTER);
		driver.findElement(By.name("username")).sendKeys(Keys.SHIFT,"a",Keys.NULL,"dmin",Keys.TAB,"admin123",Keys.TAB,Keys.ENTER);
	}

}
