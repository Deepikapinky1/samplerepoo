package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	
	private By usernameLocator=By.id("username");
	private By passwordLocator=By.id("password");
	private By clickLoginLocator=By.xpath("//button[@title='Log In']");
	private By getInvalidErrorMessageLocator=By.xpath("//div[contains(normalize-space(),'We do not recognize')]");
	
	 public LoginPage(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	
	public void enterUsername(String username)
	{
		driver.findElement(usernameLocator).sendKeys(username);
	}
	public void enterPassword(String password)
	{
		driver.findElement(passwordLocator).sendKeys(password);
	}
	public void clickLogin()
	{
		driver.findElement(clickLoginLocator).click();
	}
    public String getInvalidErrorMessage()
    {
    	return driver.findElement(getInvalidErrorMessageLocator).getText();
    }
	
	//The Username or Password you entered is incorrect.
}
