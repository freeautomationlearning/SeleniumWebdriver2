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
public class Tutorial34 {

	WebDriver driver;
	public void setUP()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/hindware-atlantic-25-l-storage-water-geyser/p/itmenas6bpzqz9ad?pid=WGYENAS6HGGDN6ED&srno=s_1_1&otracker=nmenu_sub_Appliances_0_Geysers&lid=LSTWGYENAS6HGGDN6EDZWLGSX&qH=d410e3bb27c8621c");
	}
	
	public void mouseHover()
	{
		// Mouse Hover
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@alt='Hindware Atlantic 25 L Storage Water Geyser']"))).perform();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tutorial34 obj = new Tutorial34();
		obj.setUP();
		obj.mouseHover();
	}

}
