package testngsessions;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 10)
	public void searchProduct() {
		System.out.println("Search Product Test");
	}

}
