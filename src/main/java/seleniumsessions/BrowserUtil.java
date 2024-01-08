package seleniumsessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	
	private WebDriver driver;
	
	
	public WebDriver launchBrowser(String browserName) {
		System.out.println("Browser name "+ browserName);
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
		default:
			System.out.println("Please pass the right browser.....");
			throw new AutomationException("INVALID BROWSER"+ browserName);
			
		}
		return driver;
	}
	
	public void launchURL(String url) {
		if(url==null) {
			System.out.println("URL is Null");
			throw new ArithmeticException("NULL url");
		}
	}
	
	
	public void launchURL(URL url) {
		if(url==null) {
			System.out.println("URL is null");
			throw new ArithmeticException("NULL URL");
		}
	} 
	
	public String getPageTItle() {
		String title = driver.getTitle();
		System.out.println("Page title is "+title);
		return title;
	}
	
	public String getPageURL() {
		String url = driver.getCurrentUrl();
		System.out.println("Page url is "+ url);
		return url;
	}
	
	public boolean getPageSource(String value) {
		String pageSource = driver.getPageSource();
		if(pageSource.contains(value)) {
			return true;
		}
		return false;
	}
	
	public void closeBrowser() {
		driver.close();
		System.out.println("Browser is Closed");
	}
	
	public void quitBrowser() {
		driver.quit();
		System.out.println("Browser is Closed");
	}
	
	

}
