package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		driver = new ChromeDriver();//123
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String email_Id = "input-email";
		String pwd_Id = "input-password";
		String loginBtn_xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input";
		String registerLink = "Register";
		
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys("id", email_Id, "test@gmail.com");
		eleUtil.doSendKeys("id", pwd_Id, "test@123");
		eleUtil.doClick("xpath", loginBtn_xpath);
		
		String registerValue = eleUtil.doElementGetText("linkText", registerLink);
		System.out.println(registerValue);
		

		
	}

}
