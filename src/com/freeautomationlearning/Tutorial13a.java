/**
 * 
 */
package com.freeautomationlearning;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author CHIRAG
 *
 */
public class Tutorial13a {

	WebDriver driver;
	
	public void setUP()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void testHashMap()
	{
		List<WebElement> list = driver.findElements(By.tagName("a"));
		Map<String, String> m = new HashMap<String,String>();
		String text = null;
		for(WebElement ele : list)
		{
			text = ele.getText();
			if(!text.equals(""))
			{
				m.put("Google_"+text, text);
			}
		}
		
		Set<String> s = m.keySet();
		
		for(String s1 : s)
		{
			System.out.println("App Name : "+s1+" LinkText : "+m.get(s1));
		}
	}
	
	public void tearDown()
	{
		driver.quit();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tutorial13a obj = new Tutorial13a();
		obj.setUP();
		obj.testHashMap();
		obj.tearDown();
	}

}
