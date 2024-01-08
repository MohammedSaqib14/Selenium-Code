package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	@Test
	public void loginTest() {
		System.out.println("Login To App");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void searchHomePageTest() {
		System.out.println("Search Test");
	}
	
	@Test(dependsOnMethods = "searchHomePageTest") 
	public void addToCart() {
		System.out.println("Add To Cart");
	}
	
	//AAA pattern: Arrange, Act, and Assert
	//no dependency
	//no priority
	//test cases/methods should be independent
	
	@Test
	public void searchTest() {
		
	}
		

}
