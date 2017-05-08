/**
 * 
 */
package com.freeautomationlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author CHIRAG
 *
 */
public class Tutorial35 {

	WebDriver driver;
	public void setUP()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/tooltip/");

	}
	
	public void validateToolTip()
	{
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		// Mouse Hover
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("age"))).perform();
		// Validate Tool Tip
		String tool = driver.findElement(By.id("age")).getAttribute("aria-describedby");
		if(tool.contains("ui-id-"))
		{
			System.out.println("Tool tip is displayed");
		}
		else
		{
			System.out.println("Tool tip is not displayed"); 
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tutorial35 obj = new Tutorial35();
		obj.setUP();
		obj.validateToolTip();
	}

}
