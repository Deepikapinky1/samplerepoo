package com.cgi.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public WebDriver driver;
	public Properties prop;
	public WebDriver initDriver(Properties prop)
	{
		String browserName= prop.getProperty("browser").toLowerCase();
		if(browserName.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
			else if(browserName.equals("edge"))
			{
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
			else
			{
				System.out.println("Please pass the valid browser name");
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		return driver;
	}
	
	public Properties initProp() throws IOException
	{
		 prop= new Properties();
		 FileInputStream ip=new FileInputStream("D:\\Users\\DGangireddy\\git\\repository\\SeleniumJava\\src\\main\\java\\resources\\config\\config.properties");
		 prop.load(ip);
		 return prop;
		
	}
	

}
