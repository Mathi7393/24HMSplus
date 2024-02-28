package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDOBbySelectClass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/signup");
		WebElement dateDD = driver.findElement(By.id("day"));
		Select dateSe=new Select(dateDD);
		dateSe.selectByValue("31");
		WebElement monthDD = driver.findElement(By.id("month"));
		Select monthSe=new Select(monthDD);
		monthSe.selectByVisibleText("Feb");
		WebElement yearDD = driver.findElement(By.id("year"));
		Select yearSe=new Select(yearDD);
		yearSe.selectByVisibleText("1993");
	}

}
