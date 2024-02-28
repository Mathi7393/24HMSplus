package robotClass;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotRobotClassUsingRectangle1 {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://tutorialsninja.com/demo/");
//		driver.get("https://www.youtube.com/");
//		driver.get("https://omayo.blogspot.com/");
		Robot r = new Robot();
		r.delay(5000);
//		String s="Hai";
//		StringBuffer sbf=new StringBuffer(s);
//		System.out.println(sbf.reverse());
		Rectangle rec = new Rectangle(190, 290, 1140, 390);
//		r.mouseWheel(15);
//		r.delay(5000);
//		Rectangle rec1=new Rectangle()
//		r.delay(7000);
		BufferedImage src = r.createScreenCapture(rec);
		ImageIO.write(src, "PNG", new File("./ScreenShot/Robot19.png"));
		
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rec1 = new Rectangle(d);
		BufferedImage src1 = r.createScreenCapture(rec1);
		ImageIO.write(src1, "PNG", new File("./ScreenShot/Robot18.png"));
	
//		r.keyPress(KeyEvent.VK_PRINTSCREEN);
//		r.keyRelease(KeyEvent.VK_PRINTSCREEN);
//		r.delay(2000);
//		Actions actions=new Actions(driver);
//		r.delay(5000);
//		r.mouseMove(190, 290);
//		actions.clickAndHold().perform();
//		r.delay(2000);
//		r.mouseMove(1330, 675);
//		actions.release().perform();

	}

}
