package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String parentWindowId = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(3000);
		
		driver.get("https://www.youtube.com");
		System.out.println(driver.getTitle());
		
		driver.close();
		driver.switchTo().window(parentWindowId);
		
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
