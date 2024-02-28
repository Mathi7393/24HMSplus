package Locators;

public class H_OverMessages {

	public static void main(String[] args) {
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[contains(text(),Login)]")).click();
//		List<WebElement> HOverMsg = driver.findElements(By.xpath("//div[@class='orangehrm-quick-launch-heading']"));
//		for (WebElement msg : HOverMsg) {
//			System.out.println(msg.getAttribute("title"));
//		}
//		driver.quit();
		OragneHRM or=new OragneHRM();
		or.accessBrowser();
		or.Login();
		System.out.println(or.getHOverMsg());
		or.logout();
		or.closeBrowser();
	}

}
