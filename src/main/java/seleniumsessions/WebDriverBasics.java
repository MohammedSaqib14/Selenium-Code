package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasics {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//1. open the browser: chrome
				//2. enter url
				//3. get the title
				//4. verify the title: act vs exp
				//5. close the browser
				
				//automation steps
				//ChromeDriver driver = new ChromeDriver();//chrome
				//FirefoxDriver driver = new FirefoxDriver();//ff
				//EdgeDriver driver = new EdgeDriver();//edge
		
		String browser = "chrome";
		
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver(); 
			break;
			
		case "friefox":
			driver = new FirefoxDriver(); 
			break;
			
		case "edge":
			driver = new EdgeDriver(); 
			break;
			
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Please pass the right browser.....");
			break;
		}
		
		driver.get("https://www.google.com");
		
		String actTitle = driver.getTitle();
		System.out.println("Title is "+ actTitle);
		
		if (actTitle.equals("Google")) {
			System.out.println("Title is correct--- Pass");
		}else {
			System.out.println("Incorrect title --- Fail");
		}
		
		String appUrl = driver.getCurrentUrl();
		System.out.println(appUrl);
		if (appUrl.contains("google")) {
			System.out.println("Url is correct--pass");
		}
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		if (pageSource.contains("Google apps")) {
			System.out.println("PASSSSSSSS");
		}
		
		//driver.quit();

	}

}
