package com.cgi.test;

import org.openqa.selenium.By;

import com.test.base.AutomationWrapper;

public class AddRosterToPartcipant extends AutomationWrapper {
	
	public void addRoster_ToPartcipant()
	{
		driver.findElement(By.xpath("//i[text()='settings']")).click();
		
	}

}
