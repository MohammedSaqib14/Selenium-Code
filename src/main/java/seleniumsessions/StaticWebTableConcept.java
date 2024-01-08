package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		

		driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		int count =  driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		
		String beforeXpath = "//table[@id='customers']/tbody/tr[";
		String afterXapth = "]/td[1]";
		
		for(int row=2; row<count; row++) {
			String actXpath = beforeXpath + afterXapth;
			String compName = driver.findElement(By.xpath(actXpath)).getText();
			System.out.println(compName);
		}

	}

}
