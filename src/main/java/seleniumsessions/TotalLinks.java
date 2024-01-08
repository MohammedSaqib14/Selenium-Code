package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		List<WebElement>linkList = driver.findElements(By.tagName("a"));
		System.out.println("Total Links.."+ linkList);
		
		//for(int i=0; i<linkList.size(); i++) {
		//	String text = linkList.get(i).getText();
		//	if(text.length()!=0){
		//		System.out.println(i+" "+text);
		//	}
			
		//}
		
		for(WebElement e: linkList) {
			String text = e.getText();
			if(text.length()!=0) {
				String herfVal = e.getAttribute("herf");
				System.out.println(text+" === "+herfVal);
			}
		}

	}

}
