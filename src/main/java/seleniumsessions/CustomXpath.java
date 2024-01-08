package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		//1.absolute xPath: /html/body/div[2]/div/div/div[2]/div[2]/div/div[2]/h4/a
		//2. relative xPath: using element attributes with xPath functions 
		
		//htmlTag[@attrName='value']
		//input[@name='Search']
		//input[@placeholder='Search']
		//input[@id='input_email']
		
		//htmltag[@attr1='value' and @attr2='value']
		//input[@type='text' and @name='field-keywords']
		
		//input[@type='email' and @name='email']
		
		int linksCount = driver.findElements(By.xpath("//a")).size();
		System.out.println(linksCount);

	}

}
