package practice;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleChromeDownlods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("chrome://downloads/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.querySelector('downloads-manager').shadowRoot.querySelector(\"downloads-toolbar[id='toolbar']\").shadowRoot.querySelector(\"cr-toolbar[id='toolbar']\").shadowRoot.querySelector(\"cr-toolbar-search-field[id='search']\").shadowRoot.querySelector(\"div[id='searchTerm']>input[id='searchInput']\").value=\"mathi\";");
		/**
		 * need to test for search icon by downloading some file search using text
		 */
//		js.executeScript("document.querySelector('downloads-manager').shadowRoot.querySelector(\"downloads-toolbar[id='toolbar']\").shadowRoot.querySelector(\"cr-toolbar[id='toolbar']\").shadowRoot.querySelector(\"cr-toolbar-search-field[id='search']\").shadowRoot.querySelector(\"cr-icon-button[id='icon']\").click()");
		
	}

}
