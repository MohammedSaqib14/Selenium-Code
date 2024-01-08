package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDisabledElements {

	public static void main(String[] args) throws InterruptedException {
		
	 WebDriver driver = new ChromeDriver();
//	 driver.get("https://classic.freecrm.com/register/");
//	 Thread.sleep(3000);
//	 
//	 WebElement submit =  driver.findElement(By.id("submitButton"));
//	 
//	 Actions act = new Actions(driver);
//	 act.click(submit).perform();
	 
	 driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
	 WebElement pwd =  driver.findElement(By.id("pass"));
	 
	 Actions act = new Actions(driver);
	 act.sendKeys(pwd, "test@123").perform();
	 
	 driver.findElement(By.id("fname")).sendKeys(null);
	 
	 

	}

}
