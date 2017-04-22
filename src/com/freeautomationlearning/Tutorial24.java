/**
 * 
 */
package com.freeautomationlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author CHIRAG
 *
 */
public class Tutorial24 {

// URL for selenium exception : https://seleniumhq.github.io/selenium/docs/api/py/common/selenium.common.exceptions.html#selenium.common.exceptions.InvalidElementStateException 
	
	WebDriver driver;
	
	public void setUP()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
	
	public void testException()
	{
		try {
			boolean searchField= false;
			try {
				searchField = driver.findElement(By.name("q12")).isDisplayed();	
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
			System.out.println("Is Search Filed Displayed : "+searchField);
			boolean gmailLink = false;
			try {
				gmailLink = driver.findElement(By.linkText("Gmail")).isDisplayed();
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
			System.out.println("Is Gmail Link Displayed : "+gmailLink);
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tutorial24 obj = new Tutorial24();
		obj.setUP();
		obj.testException();

	}

}
