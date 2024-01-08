package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertJSPopUpHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//1.alertJSPopup;
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		//2.confirm popup;
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		Thread.sleep(2000);
//		alert.dismiss();
		
		//3. prompt popup;
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Automation");
		Thread.sleep(2000);
		alert.accept();

	}

}
