package seleniumsessions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarouselHandling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.noon.com/uae-en/");
		Thread.sleep(5000);
		
		getCarouselItems();

	}
	
	public static void getCarouselItems() {
		String xpath = "//img[contains(@alt,'yellow-friday-selling-fast-uae')]/ancestor::div[@class='componentArea-19']/following-sibling::div//div[@data-qa='product-name']";
		String nextPath = "//img[contains(@alt,'yellow-friday-selling-fast-uae')]/ancestor::div[@class='componentArea-19']/following-sibling::div[@class='componentArea-20']//div[contains(@class,'swiper-button-next')]";
		
		List<WebElement> productList = driver.findElements(By.xpath(xpath));
		Set<String> productSet = new HashSet<String>();
		
		while(!driver.findElement(By.xpath(xpath)).getAttribute("class").contains("swiper-button-disabled")){
			
			for(WebElement e : productList) {
				String productName = e.getAttribute("title");
				productSet.add(productName);
			}
			driver.findElement(By.xpath(nextPath)).click();
			
		}
		
		for(String e : productSet) {
			System.out.println(e);
		}
		
	}

}
