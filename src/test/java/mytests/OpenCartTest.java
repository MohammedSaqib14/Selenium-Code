package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest{
	
	@Test(priority = 1)
	public void isOpenCartLogoIsVisibleTest() {
		boolean flag = driver.findElement(By.cssSelector(".img-responsive")).isDisplayed();
		Assert.assertEquals(flag, true);
	}
	
	@Test(priority = 2)
	public void openCartTitleTest() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "Your Store");
	}
	
	@Test(priority = 3)
	public void openCartURLTest() {
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		Assert.assertTrue(actualUrl.contains("openacrt"));
	}
	

}
