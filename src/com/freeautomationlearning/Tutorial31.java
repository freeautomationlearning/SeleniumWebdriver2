/**
 * 
 */
package com.freeautomationlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author CHIRAG
 *
 */
public class Tutorial31 {

	WebDriver driver;
	public void setUp()
	{
		driver = new FirefoxDriver();
		
	}
	
	public void introAction()
	{
		// Syntax of Actions
		Actions actions = new Actions(driver);
		// perform method is mandatory
		actions.doubleClick().perform();
		
		// For multiple actions we use build().perform() methods
		actions.moveToElement(driver.findElement(By.id("id"))).click().build().perform();
	
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
