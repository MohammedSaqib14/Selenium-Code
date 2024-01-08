package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementsHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("q")).sendKeys("macBook");
		driver.findElement(By.xpath("//button//*[local-name()='svg' and @fill='none']")).click();

	}

}
