package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VtigerDropDownUsingSelectClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("password");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[contains(@title,'Create Organization')]")).click();
		WebElement industryDropDown = driver.findElement(By.name("industry"));
		Select ise=new Select(industryDropDown);
		ise.selectByValue("Banking");
		WebElement typeDropDown = driver.findElement(By.name("accounttype"));
		Select tse=new Select(typeDropDown);
		tse.selectByIndex(3);
		WebElement ratingDropDown=driver.findElement(By.name("rating"));
		Select rse=new Select(ratingDropDown);
		rse.selectByVisibleText("Acquired");
		Thread.sleep(5000);
		driver.quit();
	}

}
