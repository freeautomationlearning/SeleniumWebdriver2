package com.freeautomationlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstFFLaunch {

	//Launch FF
	// Navigate google.com
	// Search Selenium
	
	// WebDriver is interface
	WebDriver driver;
	
	public void launchFF()
	{
		// FirefoxDriver is Class
		driver = new FirefoxDriver();
		
		// Maximize the window
		driver.manage().window().maximize();
		
		// Open the url
				driver.get("http://www.google.com");
		
		// Implicate wait to the driver
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	public void serachKeyword(String text)
	{
		driver.findElement(By.name("q")).sendKeys(text);
	}
	
	public static void main(String[] args) {
	
		FirstFFLaunch obj = new FirstFFLaunch();
		obj.launchFF();
		obj.serachKeyword("selenium");
	}

}
