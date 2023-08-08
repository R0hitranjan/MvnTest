package com.stest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.BeforeMethod;

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
	
	@Test(priority=1, groups = "meta_Title")
	public void googleTitleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google", "Error message - title does not match");
	}
	
	@Test(priority=2, groups = "Page_Content")
	public void googleLogoTest() {
		Assert.assertTrue(driver.findElement(By.cssSelector("img[class='lnXdpd']")).isDisplayed());
		//String imageTitle = driver.findElement(By.id("hplogo")).getAttribute("title");
		//System.out.println(imageTitle);
	}
	
	@Test(priority=3, groups = "Page_Content")
	public void gmailButtonTest() {
		Assert.assertTrue(driver.findElement(By.linkText("Gmail")).isDisplayed());
		
	}
	
	@Test(priority= 4, groups = "printTest")
	public void test1() {
		System.out.println("test_1");
	}
	@Test(priority= 5, groups = "printTest")
	public void test2() {
		System.out.println("test_2");
	}
	
	@Test(priority= 6, groups = "printTest")
	public void test3() {
		System.out.println("test_3");
	}

	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
