package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String title = js.executeScript("return document.title").toString();
//		System.out.println(title);
		
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		String title = jsUtil.getTitleByJS();
//		System.out.println(title);
		
		//jsUtil.generateJSAlert("Hello Naveen");
		
//		String pageText= js.executeScript("return document.documentElement.innerText;").toString();
//		System.out.println(pageText);
//		if(pageText.contains("Alerts & Reminders")) {
//			System.out.println("Alerts & Reminders----Pass");
//		}
		
		Thread.sleep(1000);
		jsUtil.scrollPageDown();
		Thread.sleep(1000);
		jsUtil.scrollPageUp();
		
		

	}

}
