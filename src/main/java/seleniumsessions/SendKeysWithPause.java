package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithPause {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		

	}
	
	public static WebElement getelement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionSendKeysWithPause(By locator, String value) {
		Actions act = new Actions(driver);
		char val[] = value.toCharArray();
		
		for(char c : val) {
			act.sendKeys(driver.findElement(locator), String.valueOf(c)).pause(500).build().perform();
		}
	}

}
