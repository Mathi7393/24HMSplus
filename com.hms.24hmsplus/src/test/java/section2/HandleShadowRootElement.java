package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleShadowRootElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]", "https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[.='Shadow Root Elements']")).click();
		driver.findElement(By.xpath("//section[.='Shadow Root']")).click();
		js.executeScript("document.querySelector(\"form[class='pe-5']>div\").shadowRoot.querySelector(\"input[placeholder='Enter your username']\").value='mathivarman1'");
		js.executeScript("document.querySelector(\"form[class='pe-5']>div+div\").shadowRoot.querySelector(\"input[placeholder='Enter your password']\").value='mathi5566'");
	}

}
