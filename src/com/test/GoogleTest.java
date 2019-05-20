package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	/*
	[RemoteTestNG] detected TestNG version 6.14.3
	google logo test
	Google Title Test
	Gmail search test
	PASSED: googleLogoTest
	PASSED: googleTitleTest
	PASSED: searchTest
	 */
	//BeforeMethod, test, AfterMethod
	WebDriver driver;
		//1,4,7
		@BeforeMethod
		public void setUp() {		
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.google.com/");
		}
		//5
		//test cases -- starting with @Test
		@Test
		public void googleTitleTest() {
			String title = driver.getTitle();
			System.out.println("Google Title Test");
		}
		//2
		@Test
		public void googleLogoTest() {
			boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
			System.out.println("google logo test");
		}
		//8
		@Test
		public void searchTest() {
			boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
			System.out.println("Gmail search test");
		}
		//3,6,9
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}

}
