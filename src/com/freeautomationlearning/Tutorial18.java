/**
 * 
 */
package com.freeautomationlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author CHIRAG
 *
 */
public class Tutorial18 {

	WebDriver driver;
	// Set Up CHROME Driver on m/c
	public void setUP()
	{
		String path = System.getProperty("user.dir");
		// We set path of the chromedriver.exe to our environment variable
		System.setProperty("webdriver.chrome.driver", path+"//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	public void testGoogle()
	{
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println(driver.getTitle());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tutorial18 obj = new Tutorial18();
		obj.setUP();
		obj.testGoogle();
	}

}
