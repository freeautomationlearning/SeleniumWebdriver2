/**
 * 
 */
package com.freeautomationlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author CHIRAG
 *
 */
public class Tutorial16 {

	static WebDriver driver;
	
	public static void setUP()
	{
		driver = new FirefoxDriver();
		// Maximize our window
		driver.manage().window().maximize();
		// Implicity Wait
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// Pageload timeout
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// SetScript Timeout
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	public static void testTimeout()
	{
		System.out.println("Tittle of the window : "+driver.getTitle());
		// For executeAsyncScript method we need to set up set script time out
		//((JavascriptExecutor)driver).executeAsyncScript("", "");
	}
	/**
	 * @param args
	 */	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 setUP();
		 testTimeout();
	}

}
