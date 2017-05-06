/**
 * 
 */
package com.freeautomationlearning;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author CHIRAG
 *
 */
public class Tutorial30 {

	WebDriver driver;
	public void setUP()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	/*When xpath is not present on the HTML then 
	 * Test case is failed and we got screenshot 
	 * on the screen.
	 * */
	
	public void searchKeywords()
	{
		try {
			driver.findElement(By.name("q11")).sendKeys("Selenium Webdriver");
		} catch (Exception e) {
			captureScreenshot(driver);
		}
	}
	
	
	public void captureScreenshot(WebDriver d)
	{
		String path = System.getProperty("user.dir");
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss_SSS");
		Date date = new Date();
		String name = sdf.format(date);
		String capName = path+"\\screenshots\\"+name;
		System.out.println(capName);
		// Code for take screenshot
		File file = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		// Code for copy screenshot to specific location
		try {
			FileUtils.copyFile(file, new File(capName+".PNG"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tutorial30 obj = new Tutorial30();
		obj.setUP();
		obj.searchKeywords();
	}

}
