/**
 * 
 */
package com.freeautomationlearning;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author CHIRAG
 *
 */
public class Tutorial38 {

	WebDriver driver;
	public void setUP()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
	
	public void openTab()
	{
		Actions act = new Actions(driver);
		// This code for open a new Tab
		act.keyDown(Keys.CONTROL).sendKeys("t").build().perform();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tutorial38 obj = new Tutorial38();
		obj.setUP();
		obj.openTab();

	}

}
