package Assignment;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleShadowRootElementInBooksApp {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]", "https://books-pwakit.appspot.com/explore?9=");
//		js.executeScript("document.querySelector(\"book-app[apptitle='BOOKS']\").shadowRoot.querySelector(\"app-header[effects='waterfall']>app-toolbar[class='toolbar-bottom']>book-input-decorator>input[id='input']\").value='mathivarman1'");
		js.executeScript("document.querySelector(\"body > book-app\").shadowRoot.querySelector(\"#input\").value='mathi'");
//		js.executeScript("document.querySelector(\"[apptitle='BOOKS']\").shadowRoot.querySelector(\"input[id='input']\").value=\"Subham\";");
	}

}
