package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleUrl {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By aboutUSLink = By.linkText("About Us");
		driver.findElement(aboutUSLink).click();
		
		String title = waitForTitleContains(10, "About Us"); 

	}
	
	public static String waitForTitleContains(int timeOut, String titleFraction) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if(wait.until(ExpectedConditions.titleContains(titleFraction))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println(titleFraction+ "title value not is present");
			e.printStackTrace();
		}
		return null;
	}
	
	public static String waitForTitles(String title, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if(wait.until(ExpectedConditions.titleContains(title))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println(title + " title value is not present" );
			e.printStackTrace();
		}
		return null;
				
	}
	
	public static String waitForURLContains(String Url, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if(wait.until(ExpectedConditions.titleContains(Url))) {
				return driver.getCurrentUrl();
			}
		} catch (TimeoutException e) {
			System.out.println(Url + " Url value is not present" );
			e.printStackTrace();
		}
		return null;
				
	}
	
	public static String waitForURLToBe(String Url, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if(wait.until(ExpectedConditions.titleContains(Url))) {
				return driver.getCurrentUrl();
			}
		} catch (TimeoutException e) {
			System.out.println(Url + " title value is not present" );
			e.printStackTrace();
		}
		return null;
				
	}

}
