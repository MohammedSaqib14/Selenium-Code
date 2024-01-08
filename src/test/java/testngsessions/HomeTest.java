package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest {
	

	// Python: PyTest/UnitTest
	// .Net: Nunit
	// Java: Junit/TestNG
	// NODE JS: Mocha/Jasmine

	// feature: method: API: WS: white box testing: static analysis
	//test coverage: 100%
	//code coverage: 100%
	//SonarQube, Jacoco, Cobertura
	
	private int sum(int a, int b) {
		return a+b;
	}
	
	//user: web app: functional testing
	public void calSum(int a, int b) {
		sum(a,b);
	}
	
	//test- Unit test + assertion : Ut: dev
	@Test
	public void test1() {
		Assert.assertEquals(sum(10,20), 30);
	}
	
	@Test 
	public void Test2() {
		Assert.assertEquals(sum(-10,20), 30);
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(sum(0,20), 30);
	}
	@Test
	public void test4() {
		Assert.assertEquals(sum(-10,-20), -30);
	}
	
}
