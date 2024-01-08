package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMenuHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		Thread.sleep(4000);
		
		By parentShopByMenu =  By.xpath("(//span[text()='Shop by'])[2]");
		
		By fruitsSecondMenu = By.linkText("Fruits & Vegetables");
		
		By freshFruitThirdMenu = By.linkText("Fresh Fruits");
		
		By mangoesFourthMenu = By.linkText("Mangoes");
		
		multiMenuHandle1(parentShopByMenu, fruitsSecondMenu, freshFruitThirdMenu, mangoesFourthMenu);

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void multiMenuHandle1(By parentMneuLocator, By firstChildMenuLocator, 
			By secondChildMenuLocator, By thirdChildMenuLocator) {
		
		Actions act = new Actions(driver);
		
		getElement(parentMneuLocator).click();
		
		act
			.pause(500)
				.moveToElement(getElement(firstChildMenuLocator))
					.pause(500)
						.moveToElement(getElement(secondChildMenuLocator))
							.pause(500)
								.click(getElement(thirdChildMenuLocator)).build().perform();
		
		
		
	}
	
	public static void multiMenuHandle(By parentMenuLocator,By firstChildMenuLocator, By secondChildMenuLocator,
			By thirdChildMenuLocator) throws InterruptedException {
		
		Actions act = new Actions(driver);
		driver.findElement(parentMenuLocator);
		Thread.sleep(1000);
		
		act.moveToElement(driver.findElement(firstChildMenuLocator)).build().perform();
		Thread.sleep(1000);
		
		act.moveToElement(driver.findElement(secondChildMenuLocator)).build().perform();
		Thread.sleep(1000);
		
		act.moveToElement(driver.findElement(thirdChildMenuLocator)).click();
		
	}

}
