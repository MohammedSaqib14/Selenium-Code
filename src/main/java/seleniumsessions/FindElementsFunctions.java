package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsFunctions {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");

		By links = By.tagName("a");
		By images = By.tagName("img");
		
		int listCount = getElementsCount(links);
		System.out.println(listCount);
		
		int imagesCount = getElementsCount(images);
		
		

	}
	
	public static List<String> getElementsTextList(By locator) {
		List<WebElement>eleList = getElements(locator);
		
		List<String>eleTextList = new ArrayList<String>();
		for(WebElement e : eleList) {
			String text = e.getText();
			
			if(text.length()!=0) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}
	
	public static List<String> getElementsAttributeList(By locator, String attrName) {
		List<WebElement>eleList = getElements(locator);
		List<String>eleAttrList = new ArrayList<String>();
		
		for(WebElement e: eleList) {
			String attrVal = e.getAttribute(attrName);
			eleAttrList.add(attrVal);
		}
		return eleAttrList;
	}
	
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
