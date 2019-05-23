package webtest;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Assertion {

	@Test
	public void test1() {
		String mystr = "Beverly Liu";
		Assert.assertTrue(mystr.contains("Ben"), "Names are not matching");
	}
	
	@Test
	public void test2() {
		Assert.assertTrue(false);
	}
	
}
