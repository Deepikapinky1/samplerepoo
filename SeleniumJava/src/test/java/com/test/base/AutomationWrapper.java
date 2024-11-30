package com.test.base;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.cgi.factory.DriverFactory;
import com.test.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationWrapper {
	protected WebDriver driver;
	public Properties prop;
	DriverFactory df;
	@BeforeMethod
	public void setup() throws IOException
	{
		df=new DriverFactory();
		prop=df.initProp();
		driver=df.initDriver(prop);
		LoginPage login=new LoginPage(driver);
		login.enterUsername("mary");
		login.enterPassword("123456");
		login.clickLogin();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
