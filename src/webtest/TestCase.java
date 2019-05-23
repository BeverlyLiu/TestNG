package webtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

	//Implement on class level
	//[RemoteTestNG] detected TestNG version 6.14.3

	//Test case started and details areGoogleTitleVerify
	//Google
	//Test cases success and details areGoogleTitleVerify
	
	//Test case started and details areTitleMatch
	//Test match passed
	//Test cases success and details areTitleMatch

	//PASSED: GoogleTitleVerify
	//PASSED: TitleMatch

//@Listeners(webtest.TestNGListerner.class)

public class TestCase {
	
	@Test
	public void GoogleTitleVerify() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	@Test
	public void TitleMatch() {
		System.out.println("Test match passed");
		Assert.assertTrue(true);
	}

}
