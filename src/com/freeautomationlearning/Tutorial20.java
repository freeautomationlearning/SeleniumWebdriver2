/**
 * 
 */
package com.freeautomationlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * @author CHIRAG
 *
 */
public class Tutorial20 {

	WebDriver driver;
	public void setUP()
	{
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.edge.driver", path+"//driver//MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void testEdge()
	{
		driver.findElement(By.name("q")).sendKeys("selenium");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tutorial20 obj = new Tutorial20();
		obj.setUP();
		obj.testEdge();

	}

}
