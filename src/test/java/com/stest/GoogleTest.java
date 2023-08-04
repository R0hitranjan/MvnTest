package com.stest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().setPosition(new Point(1350,10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://google.com");
		
		
	}
	
	@Test(priority=1)
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}
	
	@Test(priority=2)
	public void googleLogoTest() {
		Assert.assertTrue(driver.findElement(By.id("hplogo")).isDisplayed());
		String imageTitle = driver.findElement(By.id("hplogo")).getAttribute("title");
		System.out.println(imageTitle);
	}
	
	@Test(priority=3)
	public void gmailButtonTest() {
		Assert.assertTrue(driver.findElement(By.linkText("Gmail")).isDisplayed());
		
	}

	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
