package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIFrameHandle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		//f1
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("First crush");
		
		//f2
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("Current Crush Name");
		
		//f3
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("Destiny");
		
		//f3---> f1 not valid
		//f3-->f2-->f1 not valid
		
		//driver.switchTo().frame("pact2");
		//driver.switchTo().frame("pact1");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("jex")).sendKeys("Second Crush");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("inp_val")).sendKeys("First Crush 2");
		
		
		
		

	}

}
