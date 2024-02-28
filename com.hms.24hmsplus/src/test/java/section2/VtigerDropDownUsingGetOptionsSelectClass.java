package section2;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VtigerDropDownUsingGetOptionsSelectClass {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"password",Keys.TAB,Keys.ENTER);
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[contains(@title,'Create Organization')]")).click();
		WebElement industryDropDown = driver.findElement(By.name("industry"));
		Select ise=new Select(industryDropDown);
		List<WebElement> indusOpt = ise.getOptions();
		for (WebElement opt : indusOpt) {
			System.out.println(opt.getAttribute("value"));
		}
		driver.manage().window().minimize();
		System.out.println("Enter option:");
		String option=s.nextLine();
		for (WebElement opt2 : indusOpt) {
//			System.out.println(opt2.getText());
			if (opt2.getAttribute("value").equalsIgnoreCase(option)) {
				opt2.click();
//				break;
			}
		}
		driver.manage().window().maximize();
		Thread.sleep(10000);
//		driver.quit();
	}

}
