package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownOptions {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		By countryList = By.id("Form_getForm_Country");
		
		int countryCount = getDropDownCountryCount(countryList) -1;
		if(countryCount==232) {
			System.out.println("PASS");
		}

	}
	
	public static WebElement getELement(By locator) {
		return driver.findElement(locator);
	}
	
	public static int getDropDownCountryCount(By locator) {
		Select select = new Select(getELement(locator));
		return select.getOptions().size();
	}
	
	public static List<String> getDropDownOption(By locator) {
		Select select = new Select(getELement(locator));
		List<WebElement>optionList = select.getOptions();
		List<String> optionsTextList = new ArrayList<String>();
		
		for(WebElement e : optionList) {
			String text = e.getText();
			optionsTextList.add(text);	
		}
		return optionsTextList;
	}
	
	public static void selectDropDownOption(By locator, String dropDownValue) {
		Select select = new Select(getELement(locator));
		
		List<WebElement> optionsList = select.getOptions();
		
		System.out.println(optionsList);
		
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			
			if(text.equals(dropDownValue)) {
				e.click();
				break;
			}
		}
	}

}
