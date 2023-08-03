package com.stest;

import org.testng.annotations.Test;
import org.testng.Assert;


public class AppTest {
	
	
	@Test
	public void successLogin() {
		App myapp = new App();
		Assert.assertEquals(1, myapp.userLogin("abc", "abc@123"));
	}
	@Test
	public void failedLogin() {
		App myapp = new App();
		Assert.assertEquals(0, myapp.userLogin("abc", "abc123"));
	}
	
}
