package com.stest;

import org.testng.annotations.Test;


public class TestNgReatures {
	
	@Test
	public void loginTest() {
		System.out.println("login test");
		//int i = 1/0; //(to fail this test case)
	}
	
	@Test(dependsOnMethods = "loginTest",invocationCount = 20, threadPoolSize = 5)
	public void homePageTest() {
		System.out.println("Home page test");
	}
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void formatTest() {
		String x = "100A";
		Integer.parseInt(x);
	}

}
