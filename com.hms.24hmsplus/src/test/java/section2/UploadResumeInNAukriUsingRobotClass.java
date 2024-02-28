package section2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadResumeInNAukriUsingRobotClass {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=Cj0KCQiAmNeqBhD4ARIsADsYfTfjxcWK1N49X7lq_aLRVtlbP4KSDCm3bcYpQ_n7AEOTrj9kxGbIi88aAhr_EALw_wcB&gclsrc=aw.ds");
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		//to select the file
		StringSelection ss=new StringSelection("C:\\Users\\mathi\\OneDrive\\Desktop\\New folder\\RojaReddy.pdf");
	
		//to copy the file
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
				
		//to paste the file
		Robot r=new Robot();
		r.delay(2000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
