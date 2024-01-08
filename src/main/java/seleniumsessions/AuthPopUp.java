package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		String userName = "admin";
		String password = "admin";
		driver.get("https://"+userName+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");

	}

}
