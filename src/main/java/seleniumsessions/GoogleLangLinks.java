package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLangLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {
		

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		By langLinks = By.xpath("//div[@id='SIvCob']/a");
		
		clickOnElement(langLinks, "हिन्दी");
	}
	
	public static void clickOnElement(By locator, String eleText) {
		List<WebElement>langsLinks = driver.findElements(locator);
		System.out.println(langsLinks.size());
		for(WebElement e : langsLinks) {
			String text = e.getText();
			System.out.println(text);
		}
		
	}

}
