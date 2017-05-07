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
public class Tutorial32 {

	WebDriver driver;
	public void setUP()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	}
	
	public void rightClick()
	{
		// This code for Right Click
		Actions action = new Actions(driver);
		action.contextClick(driver.findElement(By.xpath("//*[text()='right click me']"))).perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//span[text()='Paste']")).click();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tutorial32 obj = new Tutorial32();
		obj.setUP();
		obj.rightClick();

	}

}
