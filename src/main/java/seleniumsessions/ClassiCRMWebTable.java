package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassiCRMWebTable {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		
		selectUser("Mustafa Hanif");
		String compName = getUserCompanyName("Cerner");
		System.out.println(compName);
		
		
		
		

	}
	
	public static String getUserCompanyName(String userName) {
		return
				driver.findElement(By.xpath("/a[text()='\"+userName+\"']/parent::td//following-sibling::td/a[@context='company"))
				.getText();
	}
	
	public static void selectUser(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
		.click();
	}

}
