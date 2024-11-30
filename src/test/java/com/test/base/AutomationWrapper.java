package com.test.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationWrapper {
	protected WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://c32bjtmp3.v3locitydev.com/");
		driver.findElement(By.id("username")).sendKeys("mary");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@title='Log In']")).click();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
