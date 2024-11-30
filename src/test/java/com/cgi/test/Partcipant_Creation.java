package com.cgi.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.base.AutomationWrapper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Partcipant_Creation extends AutomationWrapper{
	
	@Test
	 public void partcipantcreation() {
	
		driver.findElement(By.xpath("//div[text()=\"World\"]")).click();
		driver.findElement(By.xpath("//i[text()='add_circle']")).click();
		driver.findElement(By.xpath("//span[text()='Participant']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\'tapestry\']")));
		driver.findElement(By.cssSelector("#first.firstColumnInput")).sendKeys("John");
		driver.findElement(By.name("last")).sendKeys("smith");
		driver.findElement(By.id("ssn")).sendKeys("563411329");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("v3-widget-indicative-table-save-button-v3editbutton")).click();
		//js.executeScript("arguments[0].click();", save);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\'tapestry\']")));
		WebElement s=driver.findElement(By.id("altid2"));
		String PersonID=s.getAttribute("value");
		System.out.println(PersonID);
		Assert.assertEquals(false, null);
	}

}
