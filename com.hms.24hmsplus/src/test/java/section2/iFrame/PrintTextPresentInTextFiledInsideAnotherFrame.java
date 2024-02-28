package section2.iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTextPresentInTextFiledInsideAnotherFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame("mce_0_ifr");
		System.out.println(driver.findElement(By.xpath("//p")).getText());
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[.='File']")).click();

	}

}
