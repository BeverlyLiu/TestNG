package webtest;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * [RemoteTestNG] detected TestNG version 6.14.3
	Test case 1 started
	Test case 2 started
	Test case 3 started
	Test case 3 completed
	PASSED: test3
	FAILED: test1
 * java.lang.AssertionError: expected [13] but found [12]
 * FAILED: test2
 * java.lang.AssertionError: Dropdown count does not match please check with developer expected [13] but found [12]
 */

public class AssertionScripts {

	@Test
	public void test1() {
		System.out.println("Test case 1 started");
		Assert.assertEquals(12, 13);
		System.out.println("Test case 1 failed");
	}
	
	@Test
	public void test2() {
		System.out.println("Test case 2 started");
		Assert.assertEquals(12, 13, "Dropdown count does not match please check with developer");
		System.out.println("Test case 2 failed");
	}
	
	@Test
	public void test3() {
		System.out.println("Test case 3 started");
		Assert.assertEquals("Hello", "Hello", "If words does not match, please raise a bug");
		System.out.println("Test case 3 completed");
	}
	
}
