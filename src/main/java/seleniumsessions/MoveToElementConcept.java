package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		
//		Actions act = new Actions(driver);
//		
//		By parentMenu = By.cssSelector("a.menulink");
//		
//		WebElement parentMenuEle = driver.findElement(parentMenu);
//		
//		act.moveToElement(parentMenuEle).build().perform();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.linkText("COURSES")).click();
		
		By parentMenu = By.cssSelector("a.menulink");
		By childMenuLocator = By.linkText("COURSES");
		
		parentChildMenu(parentMenu, childMenuLocator);

	}
	
	public static WebElement getLoctaor(By locator) {
		return driver.findElement(locator);
	}
	
	public static void parentChildMenu(By parentMenuLocator, By childMenuLocator) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(parentMenuLocator)).build().perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(childMenuLocator)).click();
	}

}
