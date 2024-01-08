package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//create webElemnt + perform action(click, sendKeys, getText, isDisplayed)
		//driver.findElement(By.id("input-email111")).sendKeys("test@gmail.com");
		
		//no such element exception : unable to locate element
		
		int totalBill = 123;
		//String totalBillAmount = String.valueOf(totalBill);
		//driver.findElement(By.id("input-email")).sendKeys(totalBillAmount);
		
		
		//driver.findElement(By.id("input-email")).sendKeys(null);
		//IllegalArgumentException: keys to send should not be null charSequence
		
		//sendKeys: string, stringBuilder, stringBuffer
		StringBuffer sb = new StringBuffer("test");
		//driver.findElement(By.id("input-email")).sendKeys(sb);
		
		driver.findElement(By.id("input-email")).sendKeys(sb+"automation");
		
		

	}

}
