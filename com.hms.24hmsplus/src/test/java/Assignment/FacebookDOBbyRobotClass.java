package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDOBbyRobotClass {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) throws AWTException, InterruptedException {
		int tdate=0;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().minimize();
		System.out.println("enter the date:");	
		WebElement dt = driver.findElement(By.id("day"));
		int date=s.nextInt();
		driver.manage().window().maximize();
		int currentDate=Integer.parseInt(dt.getAttribute("value"));
		System.out.println(currentDate);
		Robot r = new Robot();
		
		if (date>currentDate) {
			tdate=date-currentDate;
//			System.out.println(tdate);
			for (int i = 0; i < tdate; i++)
			{
				dt.click();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(3000);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			}
		}
		else if (date==currentDate) {
			tdate=0;
		}
		else {
			tdate=currentDate-date;
			for (int i = 0; i < tdate; i++)
			{
				dt.click();
				r.keyPress(KeyEvent.VK_UP);
				r.keyRelease(KeyEvent.VK_UP);
				Thread.sleep(3000);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			}
		}
//		driver.findElement(By.id("day")).click();

		Thread.sleep(5000);
		driver.quit();
	}

}
