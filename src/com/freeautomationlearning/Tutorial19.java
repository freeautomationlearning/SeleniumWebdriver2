/**
 * 
 */
package com.freeautomationlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author CHIRAG
 *
 */
public class Tutorial19 {
	
	WebDriver driver;
	// Open IE browser
	public void setUP()
	{
		String path = System.getProperty("user.dir");
		// Set IEDriverServer.exe path on env var
		System.setProperty("webdriver.ie.driver", path+"//driver//IEDriverServer.exe");
		// Invoke IE BROWSER
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	
	}

	public void testSearchOnIE()
	{
		driver.findElement(By.name("q")).sendKeys("Selenium");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tutorial19 obj = new Tutorial19();
		obj.setUP();
		obj.testSearchOnIE();

	}

}
