package webtest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*
 * [RemoteTestNG] detected TestNG version 6.14.3
	Test 2 started
	Test 1 started
	Test 1 completed
	
	FAILED: testHard
	java.lang.AssertionError: expected [13] but found [12]
	
	FAILED: testSoft
	java.lang.AssertionError: The following asserts failed:
		Count does not match expected [13] but found [12]
 */

public class SoftAssertDemo {
	
	@Test
	public void testSoft() {
		
		SoftAssert assertion = new SoftAssert();
		System.out.println("Test 1 started");
		assertion.assertEquals(12, 13, "Count does not match");
		System.out.println("Test 1 completed");
		assertion.assertAll();
		
	}
	
	@Test
	public void testHard() {
		
		SoftAssert assertion = new SoftAssert();
		System.out.println("Test 2 started");
		Assert.assertEquals(12, 13);
		System.out.println("Test 2 completed");
		
		
	}

}
