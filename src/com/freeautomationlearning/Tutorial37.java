/**
 * 
 */
package com.freeautomationlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author CHIRAG
 *
 */
public class Tutorial37 {

	WebDriver driver;
	public void setUP()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/resizable/");
	}
	
	public void resizeWidget()
	{
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement widget = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		Actions act = new Actions(driver);
		// Code for resize 
		act.clickAndHold(widget).moveByOffset(80, 80).release().build().perform();
	}
		/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tutorial37 obj = new Tutorial37();
		obj.setUP();
		obj.resizeWidget();

	}

}
