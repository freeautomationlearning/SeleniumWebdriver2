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
public class Tutorial33 {

	WebDriver driver;
	public void setUP()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/droppable/");
	}
	
	public void dragAndDrop()
	{
		// Creates an Object
		Actions act = new Actions(driver);
		
		// Switch to Frame
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		// Source WebElemet
		WebElement src = driver.findElement(By.id("draggable"));
		
		// Target WebElement
		WebElement tar = driver.findElement(By.id("droppable"));
		
		// Code for Drag And Drop
		act.dragAndDrop(src, tar).perform();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tutorial33 obj = new Tutorial33();
		obj.setUP();
		obj.dragAndDrop();
	}
}
