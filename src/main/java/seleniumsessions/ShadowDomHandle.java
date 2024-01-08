package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.id("pizza")).sendKeys("pizza");
		
		String pizza_Script = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\");";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement pizza = (WebElement)js.executeScript(pizza_Script);
		pizza.sendKeys("Veg Pizza");

	}

}
