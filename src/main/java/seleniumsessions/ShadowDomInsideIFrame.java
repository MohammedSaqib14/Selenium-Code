package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomInsideIFrame {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		
		driver.switchTo().frame("pact");
		
		String tea_Script = "return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement tea = (WebElement)js.executeScript(tea_Script);
		tea.sendKeys("Masala Tea");

	}

}
