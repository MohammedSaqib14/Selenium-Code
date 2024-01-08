package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		if(eleUtil.isPageLoaded(10)) {
			System.out.println("Page is fully loaded");
		}
		
		By forgotPwd = By.linkText("Forgot your password?");
		retryingElement(forgotPwd, 10, 2000).click();
		

	}
	
	public static WebElement getLocator(By locator) {
		return driver.findElement(locator);
	}
	
	public static WebElement retryingElement(By locator, int timeOut) {
		WebElement element  = null;
		int attempts = 0;
		while(attempts < timeOut) {
			try {
				element = getLocator(locator);
				System.out.println("Element is found ..." + locator + " in attempts " + attempts);
				break;
			} catch (NoSuchElementException e) {
				System.out.println("Element is not found " + locator + " in attempts " + attempts);
				try {
					Thread.sleep(500)	;
				} catch (InterruptedException e2) {
					e.printStackTrace();
				}
			}
			attempts++;
		}
		if(element == null) {
			System.out.println("element not found ...tried for " + timeOut + "With the interval of" + 500 + "Milli seconds");
			throw new AutomationException("No such Element ");
		}
		return element ;
		
	}
	
	
	public static WebElement retryingElement(By locator, int timeOut, int intervalTime) {
		WebElement element = null;
		int attempts = 0;
		while(attempts < timeOut) {
			try {
				element = getLocator(locator);
				System.out.println("Element is found ..." + locator + " in attempts " + attempts);
				break;
			} catch (NoSuchElementException e) {
				System.out.println("Element is not found " + locator + " in attempts " + attempts);
				try {
					Thread.sleep(500)	;
				} catch (InterruptedException e2) {
					e.printStackTrace();
				}
			}
			attempts++;
		}
		if(element == null) {
			System.out.println("element not found ...tried for " + timeOut + "With the interval of" + 500 + "Milli seconds");
			throw new AutomationException("No such Element ");
		}
		return element ;
	}

}
