package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//create webElement + perform action (click, sendKeys, getText, isDisplayed)
		
		//1. id: is an attribute: is unique
		//driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		
		//2. name: is an attribute: can be duplicate 11
		//driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		
		//3. className: is an attribute: can be duplicate
		//driver.findElement(By.className("form-control")).sendKeys("test@gmail.com");
		
		//4. xPath: not an attribute: this is the address of element in HTML DOM
		//driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gamil.com");
		//driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
		
		//5. cssSelector: not an attribute
		//driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
		//driver.findElement(By.cssSelector("#input-password")).sendKeys("test@123");
		//driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
		
		By emailId = By.cssSelector("#input-email");
		By password = By.cssSelector("#input-password");
		By loginBtn = By.cssSelector("#content > div > div:nth-child(2) > div > form > input");
		By registerLink = By.linkText("Register");	
		By header = By.tagName("h2");
		By logo = By.className("img-responsive");
	
		
		
		//6 linkText: only for links: link text is not an attribute, this is the text of the link
		//html tag:<a> anchor tag
		//linkText: can be duplicate
		//driver.findElement(By.linkText("Register")).click();
		//String title = driver.getTitle();
		//System.out.println(title);
		
		//7 partialLinkText: only for links
		//html<a> anchor tag
		//driver.findElement(By.linkText("Forgotten Password")).click();
		
		//8 tagName:html tag
		//String header1 = driver.findElement(By.tagName("h2")).getText();
		//System.out.println(header1);
		
		
		By logoImage = By.className("img-responsive");
		doClick(logoImage);
		
		
		//id -- I
		//name -- II
		//className -- III
		
		//xpath
		//css
		
		//linkText
		//partiallinkText
		
		//tagName
		
		//id --> #
		//class---> .
		
	}
	
	public static String doElementGetText(By locator) {
		return getElement(locator).getText();
	}
	
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
		
		

	}


