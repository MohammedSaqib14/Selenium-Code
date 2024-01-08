package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePagination {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(5000);
		
		
		//single selection
		while(true) {
			//if ele is on 1st page itself
			if(driver.findElements(By.xpath("//td[text()='Ukraine']")).size()>0) {
				selectCountry("Ukraine");
				break;
			}else {
				//pagination logic 
				//click on next
				WebElement next = driver.findElement(By.cssSelector("#tablepress-1_next"));
				
				if(next.getAttribute("class").contains("disabled")) {
					System.out.println("Pagination is over... country not found");
					break;
				}
				next.click();
				Thread.sleep(1000);
			}
		}
		

	}
	
	public static void selectMultipleCounty(String countryName) {
		List<WebElement> eles = driver.findElements(
				By.xpath("//td[text()='"+countryName+"']/precding-sibling::td/input[@type='checkbox']"));
		for(WebElement e : eles) {
			e.click();
		}	
	}
	
	public static void selectCountry(String countryName) {
		driver.findElement(By.xpath("//td[text()='"+countryName+"']/precding-sibling::td/input[@type='checkbox']"))
		.click();
	}

}
