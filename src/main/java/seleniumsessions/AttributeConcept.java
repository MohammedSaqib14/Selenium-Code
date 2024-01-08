package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//webelement + perform action(getAttribute)
		
		By emailId = By.id("input-email");
		By registerLink = By.linkText("Register");
			
		String placeholderValue = driver.findElement(emailId).getAttribute("placeholder");
		System.out.println(placeholderValue);
			
		String herfVal = driver.findElement(registerLink).getAttribute("herf");
		System.out.println(herfVal);
		
		String className = driver.findElement(registerLink).getAttribute("class");
		System.out.println(className);
		
		By pwd = By.id("input-password");
		driver.findElement(pwd).sendKeys("naveen@123");
		String pv = doGetElementAttribute(pwd, "value");
		System.out.println(pv);
		
			

	}
	
	public static String doGetElementAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	
	


}
