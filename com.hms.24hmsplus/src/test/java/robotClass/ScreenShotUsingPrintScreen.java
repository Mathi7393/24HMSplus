package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotUsingPrintScreen {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://tutorialsninja.com/demo/");
		Robot r = new Robot();
		try {
			r.keyPress(KeyEvent.VK_WINDOWS);
			r.keyPress(KeyEvent.VK_PRINTSCREEN);
			r.keyRelease(KeyEvent.VK_WINDOWS);
			r.keyRelease(KeyEvent.VK_PRINTSCREEN);
			r.delay(2000);
			r.keyPress(KeyEvent.VK_WINDOWS);
			r.keyRelease(KeyEvent.VK_WINDOWS);
			r.delay(2000);
			r.keyPress(KeyEvent.VK_P);
			r.keyRelease(KeyEvent.VK_P);
			r.keyPress(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_A);
			r.keyPress(KeyEvent.VK_I);
			r.keyRelease(KeyEvent.VK_I);
			r.keyPress(KeyEvent.VK_N);
			r.keyRelease(KeyEvent.VK_N);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			r.delay(2000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			r.delay(2000);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			r.delay(2000);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_S);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_S);
			r.delay(2000);
			r.keyPress(KeyEvent.VK_P);
			r.keyRelease(KeyEvent.VK_P);
			r.keyPress(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_A);
			r.delay(2000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			r.delay(2000);
		} catch (Exception e) {
			System.out.println("e");
			r.keyRelease(KeyEvent.VK_WINDOWS);
			r.keyRelease(KeyEvent.VK_PRINTSCREEN);
			r.keyRelease(KeyEvent.VK_P);
			r.keyRelease(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_I);
			r.keyRelease(KeyEvent.VK_N);
			r.keyRelease(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_S);
		}

	}

}
