package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

public class RelativeLocatorConcept {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		
		WebElement ele = driver.findElement(By.linkText("Windsor, Canada"));
		
		//right of ele
		String rightIndex  = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightIndex);
		
		//left of ele
		String leftIndex = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(leftIndex);
		
		//above of ele
		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);
		
		//below of ele
		String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);
		
		//near of ele
		String nearEle = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(nearEle);
		
		List<WebElement> belowElements = driver.findElements(with(By.xpath("//div[@id='most_pollutedCitiesRank']/p")).below(ele));
		System.out.println(belowElements.size());
		
		
		for(WebElement e : belowElements) {
			String text = e.getText();
			System.out.println(text);
		}

	}


}
