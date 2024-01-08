package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		driver.findElement(By.cssSelector("#imageTemplateContainer")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')] ")));
		
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Automation");
		driver.findElement(By.id("RESULT_TextField-9")).sendKeys("Testing");
		driver.findElement(By.id("RESULT_TextField-10")).sendKeys("Testing");
		driver.findElement(By.id("RESULT_TextField-12")).sendKeys("Selenium");
		
		By state =  By.id("RESULT_RadioButton-13");
		WebElement state_ele = driver.findElement(state);
		
		Select select = new Select(state_ele);
		select.selectByVisibleText("Mississippi");
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		String header = driver.findElement(By.cssSelector("h3.details__form-preview-title")).getText();
		System.out.println(header);
		
		

	}

}
