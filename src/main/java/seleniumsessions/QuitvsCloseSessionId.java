package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitvsCloseSessionId {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		String actTitle = driver.getTitle();
		System.out.println("Title is"+ actTitle);
		
		
	
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		//driver.close();
		driver.quit();
		
		

	}

}
