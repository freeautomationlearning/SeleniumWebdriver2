/**
 * 
 */
package com.freeautomationlearning;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author CHIRAG
 *
 */
public class Tutorial11 {

	WebDriver driver;
	
	public void setUP()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	public void testArrayList()
	{
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("Size of the link : "+ list.size());
		// Declare Arraylist
		ArrayList<String> linkText = new ArrayList<String>();
		for(WebElement ele : list)
		{
			try {
				// Store/Add the values in Arraylist
				linkText.add(ele.getText());
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		System.out.println("*********************************");
		
		System.out.println("Size of the ArrayList "+linkText.size());
		int i =1;
		for(String s : linkText)
		{
			// Print the values from an array list on the console
			System.out.println(i+". ArrayList Text : "+s);
			i++;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tutorial11 obj  = new Tutorial11();
		obj.setUP();
		obj.testArrayList();

	}

}
