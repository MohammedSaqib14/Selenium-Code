package seleniumsessions;

import org.openqa.selenium.WebDriver;

public class OpenCartLoginTest {

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.launchBrowser("chrome");
		br.launchBrowser("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

	}

}
