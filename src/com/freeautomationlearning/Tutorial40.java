/**
 * 
 */
package com.freeautomationlearning;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author CHIRAG
 *
 */
public class Tutorial40 {

	WebDriver driver;
	public void setUP()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=S-0WWa6sGIfT8gefnrqYAg&gws_rd=ssl#q=selenium");
	}
	
	// Scroll Down
	public void scrollDown()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	
	// Scroll Up
	public void scrollUP()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-500)");
	}
	
	public void sleep()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tutorial40 obj = new Tutorial40();
		obj.setUP();
		obj.scrollDown();
		obj.sleep();
		obj.scrollDown();
		obj.sleep();
		obj.scrollUP();
	}

}
