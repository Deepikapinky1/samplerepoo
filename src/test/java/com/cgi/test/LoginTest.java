package com.cgi.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.base.AutomationWrapper;
import com.test.pages.LoginPage;

public class LoginTest extends AutomationWrapper {
	
	@Test
	
	public void validLoginTest()
	{
		LoginPage login=new LoginPage(driver);
		driver.get("https://c32bjtmp3.v3locitydev.com/");
		login.enterUsername("mary");
		login.enterPassword("123456");
		login.clickLogin();
		driver.findElement(By.xpath("//div[@title='Dashboard']")).isDisplayed();
		//System.out.println(actualvalue);
		//Assert.assertEquals(actualvalue, "Dashboard");
	}

	@Test
	
	public void InvalidLoginTest()
	{
		LoginPage login=new LoginPage(driver);
		driver.get("https://c32bjtmp3.v3locitydev.com/");
		login.enterUsername("mary1");
		login.enterPassword("12356");
		login.clickLogin();
		Assert.assertEquals(login.getInvalidErrorMessage(), "We do not recognize your credentials, please try another combination.");
	}

}
