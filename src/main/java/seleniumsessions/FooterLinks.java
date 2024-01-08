package seleniumsessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks {
	
	static WebDriver driver; 

	public static void main(String[] args) {
		
		driver = new ChromeDriver();//123
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By footerLinks = By.xpath("//footer//a");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		int count = eleUtil.getElementsCount(footerLinks);
		System.out.println(count);
		
		List<String>actFooterLink = eleUtil.getElementsTextList(footerLinks);
		List<String>expectedFooterLinks = Arrays.asList("About Us", "Returns", "Specials", "Wish List");
		
		if(actFooterLink.contains(expectedFooterLinks)) {
			System.out.println("imp footerLinks ... Pass");
		}

	}

}
