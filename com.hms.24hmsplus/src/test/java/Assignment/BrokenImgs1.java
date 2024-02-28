package Assignment;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImgs1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		WebElement pw = driver.findElement(By.name("password"));
//		pw.sendKeys("admin123");
//		pw.submit();
		Thread.sleep(5000);
		List<WebElement> imgs = driver.findElements(By.xpath("//img"));
//		System.out.println(imgs.size());
		ArrayList<String> imgsrc = new ArrayList<>();
		ArrayList<String> brokenImgs = new ArrayList<String>();
		for (WebElement imageSrc : imgs) {
			imgsrc.add(imageSrc.getAttribute("src"));
		}
		for (String imgae : imgsrc) {
			int statuscode = 0;
			try {

				URL url = new URL(imgae);
//				System.out.println(url);

				URLConnection urlcon = url.openConnection();
//				System.out.println(urlcon);

				HttpURLConnection httpUrl = (HttpURLConnection) urlcon;
//				System.out.println(httpUrl);

				statuscode = httpUrl.getResponseCode();
//				System.out.println(statuscode);

				if (statuscode >= 400) {
					brokenImgs.add(imgae + "" + statuscode);
				}

			} catch (Exception e) {
				continue;
			}
		}
//		driver.switchTo().frame(0);
//		List<WebElement> iframeimgs0 = driver.findElements(By.xpath("//img"));
//		System.out.println(iframeimgs0.size());
//		driver.switchTo().defaultContent();
//		
//		driver.switchTo().frame(1);
//		List<WebElement> iframeimgs1 = driver.findElements(By.xpath("//img"));
//		System.out.println(iframeimgs1.size());
//		driver.switchTo().defaultContent();
//		
//		driver.switchTo().frame(2);
//		List<WebElement> iframeimgs2 = driver.findElements(By.xpath("//img"));
//		System.out.println(iframeimgs2.size());
//		driver.switchTo().defaultContent();
		if (brokenImgs.size() == 0) {
			System.out.println("No broken images found");
		} else {
			System.out.println(brokenImgs + "\n");
		}
		driver.quit();
	}
}
