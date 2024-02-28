package Locators;

public class PracticeAutomation {

	public static void main(String[] args) throws InterruptedException {
		AutomatePracticeAutomation AP=new AutomatePracticeAutomation();
		AP.AccessBrowser();
		AP.login();
		Thread.sleep(5000);
		AP.logout();
		AP.CloseBrowser();

	}

}
