package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionCondition {
	
	String name;
	
	@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	public void loginTest() {
		System.out.println("Login Step");
		
		int i = 9/0;
		ExpectedExceptionCondition obj = null;
		System.out.println(obj.name);
		
		System.out.println("bye");
	}

}
