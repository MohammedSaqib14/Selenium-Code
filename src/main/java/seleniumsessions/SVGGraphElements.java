package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGGraphElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");
		
		Thread.sleep(10000);
		
		String state_Xpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @class='region']";
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		List<WebElement> stateList = driver.findElements(By.xpath(state_Xpath));
		System.out.println(stateList.size());
		
		Actions act = new Actions(driver);
		for(WebElement e : stateList) {
			act.moveToElement(e).perform();
			Thread.sleep(500);
			String idVal = e.getAttribute("id");
			System.out.println(idVal);
			if(idVal.contains("maryand")) {
				e.click();
				break;
			}
		}
		

	}

}
