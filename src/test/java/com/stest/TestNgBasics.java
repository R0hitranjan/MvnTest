package com.stest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class TestNgBasics {
	
	@BeforeSuite
	public void setup() {
		System.out.println("@BeforeSuite - Initial set-up/setup system property for chrome");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("@BeforeTest - launching Browser");
	}
	
	@BeforeClass
	public void enterURL() {
		System.out.println("@BeforeClass - Entering URL");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("@BeforeMethod - logging in");
	}
	
	
	
	
	@Test
	public void googleTitleTest() {
		System.out.println("@Test - Google title test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("@Test - Search Test");
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("@Test - Google logo Test");
	}
	 
	
	
	
	@AfterMethod
	public void logout() {
		System.out.println("@AfterMethod - logging out");
	}
	
	@AfterClass
	public void deleteAllCookies() {
		System.out.println("@AfterClass - Deleting all cookies");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("@AfterTest - Closing Browser");
	}
	
	@AfterSuite
	public void generateTestReport() {
		System.out.println("@AfterSuite - Generate Test Report");
	}
	

}
