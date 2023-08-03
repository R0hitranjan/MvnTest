package com.stest;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class TC_Login {
	
	@Test
	public void loginTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setPosition(new Point(1350,10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		driver.close();
	}
	

}
