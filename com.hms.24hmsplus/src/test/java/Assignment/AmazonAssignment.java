package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAssignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().setSize(new Dimension(400, 200));
		driver.manage().window().setPosition(new Point(200, 300));
		driver.manage().window().fullscreen();
		driver.manage().window().minimize();
		driver.quit();
	}

}
