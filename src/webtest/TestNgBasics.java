package webtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class TestNgBasics {
	
	/* [RemoteTestNG] detected TestNG version 6.14.3
	setup system property for Chrome (BeforeSuite)
	login to app (BeforeTest)
	Launch Chrome Browser (BeforeClass)
	
	enter URL (before method)
	google logo test
	logout from app (after method)
	
	enter URL (before method)
	Google Title Test
	logout from app (after method)
	
	enter URL (before method)
	search test
	logout from app (after method)
	
	Close Browser (fterClass)
	delete all cookies (AfterTest)
	
	PASSED: googleLogoTest
	PASSED: googleTitleTest
	PASSED: searchTest
	
	generate test report (AfterSuite)
	*/
	
	//pre-conditions annotations -- starting with @Before 
	@BeforeSuite
	public void setUp() {
		System.out.println("setup system property for Chrome (BeforeSuite)");
	}
	
	@BeforeTest
	public void login() {
		System.out.println("login to app (BeforeTest)");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch Chrome Browser (BeforeClass)");
	}
	
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("enter URL (before method)");
	}
	
	
	//test cases -- starting with @Test
	@Test
	public void googleTitleTest() {
		System.out.println("Google Title Test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("search test");
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("google logo test");
	}
	
	//post conditions -- starting with @After
	@AfterMethod
	public void logOut() {
		System.out.println("logout from app (after method)");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser (fterClass)");
	}
	
	@AfterTest
		public void deleteAllCookies() {
			System.out.println("delete all cookies (AfterTest)");
		}
	
	@AfterSuite
	public void generateTestReport() {
		System.out.println("generate test report (AfterSuite)");
	}
	
	}
