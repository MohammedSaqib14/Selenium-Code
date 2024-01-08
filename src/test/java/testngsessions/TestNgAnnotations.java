package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	
	
//	BS -- connect with DB
//	BT -- create user
//	BC -- launch Browser
//	
		//	BM -- loginToApp
		//	add to cart test
		//	AM -- logout
//	
		//	BM -- loginToApp
		//	checkout test
		//	AM -- logout
//	
		//	BM -- loginToApp
		//	search test
		//	AM -- logout
//	
//	AC -- close browser
//	AT -- delete user
//	AS -- disconnect With DB
	
	//1
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS---connected with DB");
	}
	
	//2
	@BeforeTest
	public void createUser() {
		System.out.println("BT -- user created");
	}
	
	//3
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- launch browser");
	}
	
	//4//7//10
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM -- loginToApp");
	}
	
	//11
	@Test
	public void searchTest() {
		System.out.println("search Test");
	}
	
	@Test(invocationCount = 3)
	public void addToCartTest() {
		System.out.println("add To Cart");
	}
	
	@Test
	public void checkOutTest() {
		System.out.println("Check Out Test");
	}
	
	@AfterMethod
	public void logOut() {
		System.out.println("AM -- LogOut");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- close Browser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT -- Delete User");
	}
	
	@AfterSuite
	public void disconncetWithDB() {
		System.out.println("AS -- disconnect with DB");
	}
	
	
	

}
