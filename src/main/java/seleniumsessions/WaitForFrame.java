package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrame {
	
	static WebDriver driver;

	public static void main(String[] args) {
		 driver = new ChromeDriver();
		 driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		 
		 By image = By.cssSelector("#imageTemplateContainer");
		 By frame = By.cssSelector(".details__form-image");
		 
		 By textBox = By.id("RESULT_TextField-1");
		 By header = By.cssSelector("h3.details__form-preview-title");
		 

			waitForVisibleOfElement(image, 10).click();

			waitForFrameByLocator(frame, 10);
			
			waitForVisibleOfElement(textBox, 5).sendKeys("Test Automation");
			
			driver.switchTo().defaultContent();
			
			String headerVal = waitForVisibleOfElement(header, 5).getText();
			System.out.println(headerVal);
		

	}
	public static void waitForFrameByLocator(By frameLoactor, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLoactor));
				
	}
	
	
	public static void waitForFrameByIndex(int frameIndex, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
				
	}
	
	
	public static void waitForFrameByIDOrName(String IDOrName, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(IDOrName));
	}
	
	public static void waitForFrameByElement(WebElement frameElement, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}
	
	public static WebElement waitForVisibleOfElement(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
