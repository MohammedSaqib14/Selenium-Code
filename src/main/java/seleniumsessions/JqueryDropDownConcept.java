package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDownConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		List<WebElement>choiceList = driver.findElements(By.cssSelector(".comboTreeInputBox"));
		
		for(WebElement e : choiceList) {
//			String text = e.getText();	
//			if(text.contains("choice 2")) {
//				e.click();
//				break;
//			}
			try {
				e.click();
			}
			catch (ElementNotInteractableException ex) {
				System.out.println("drop down choices are over....");
				break;
			}
		}

	}

}
