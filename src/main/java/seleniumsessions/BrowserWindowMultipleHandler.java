package seleniumsessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v116.browser.model.WindowID;

public class BrowserWindowMultipleHandler {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String parentWindowId =driver.getWindowHandle();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		//set to list
//		List<String> handleList = new ArrayList<String>(handles);
//		for(String e : handleList) {
//			
//		}
		
		Iterator<String> it = handles.iterator();
		while(it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(1500);
			
			if(windowId.equals(parentWindowId)) {
				driver.close();
			}
		}
		
		//driver.switchTo().window(parentWindowId);
		//System.out.println("Parent Window URL " + driver.getCurrentUrl());
		
		driver.quit();

	}

}
