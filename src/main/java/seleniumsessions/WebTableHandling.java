package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTableHandling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();

		driver.get("https://selectorshub.com/xpath-practice-page/");

		Thread.sleep(4000);
		
		//driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
		//.click();
		
		//Thread.sleep(4000);
		
		selectUser("Joe.Root");
		selectUser("John.Smith");
		

	}
	
	public static void selectUser(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
		.click();
	}
	
	public static void getUserInfo(String userName) {
		List<WebElement>colEles = driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td"));
		List<String>colValuesList = new ArrayList<String>();
		for(WebElement e :colEles ) {
			String text = e.getText();
			colValuesList.add(text);
		}
	}

}
