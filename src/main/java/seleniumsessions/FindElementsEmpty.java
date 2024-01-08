package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsEmpty {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		 By logo = By.cssSelector(".img-responsive");
		 
		 if(checkElementPresent(logo)) {
			 System.out.println("logo is pass");
		 }else {
			 System.out.println("FAIL");
		 }

	}
	
	public static boolean checkElementPresent(By locator) {
		  return driver.findElements(locator).size()==1 ? true: false;
	}

}
