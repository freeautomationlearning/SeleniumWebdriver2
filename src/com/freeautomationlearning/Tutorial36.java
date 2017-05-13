/**
 * 
 */
package com.freeautomationlearning;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author CHIRAG
 *
 */
public class Tutorial36 {

	WebDriver driver;
	public void setUP()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/slider/");
	}

	public void moveSilder()
	{
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement silder = driver.findElement(By.id("slider"));
		Dimension dim = silder.getSize();
		int x = dim.getWidth();
		Actions act = new Actions(driver);
		// Code of Silder
		act.clickAndHold(silder).moveByOffset(x-350, 0).release().build().perform();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Tutorial36 obj = new Tutorial36();
		obj.setUP();
		obj.moveSilder();

	}

}
