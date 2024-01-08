package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowhandle {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		
		//fetch windowID 
		Set<String> handles =  driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String parentWindowId = it.next();
		System.out.println("Parent Window Id is " + parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("Child Window Id is " + childWindowId);
		
		Thread.sleep(3000);
		
		//2. switching work
		driver.switchTo().window(childWindowId);
		System.out.println("Child Window url " + driver.getCurrentUrl());
		
		driver.close();
		
		//back to parent window
		driver.switchTo().window(parentWindowId);
		System.out.println("parent Window url " + driver.getCurrentUrl());
		
		driver.quit();

	}

}
