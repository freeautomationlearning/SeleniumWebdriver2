package com.freeautomationlearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tutorial6 {

	WebDriver driver;
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}
	
	public void webElementTest()
	{
		WebElement ele= null;
		// By is the Abstract Class
		// linText , ID ,Tagname are static methods
		
		// LinkText
		//ele = driver.findElement(By.linkText("Gmail"));
		
		//Name
		ele = driver.findElement(By.name("q"));
		ele.sendKeys("Selenium");
	}
	
	public void webElementsTest()
	{
		// FindElement method returns only single web element
		// as shown above method.
		
		// findelements method returns list of web elements 
		
		List<WebElement> eles = driver.findElements(By.tagName("a"));
		System.out.println("Number of Links : "+eles.size());
		int i=1;
		for(WebElement ele : eles)
		{
			try {
				System.out.println(i+" .Text Name : "+ele.getText());
			} catch (Exception e) {
				// TODO: handle exception
			}
			i++;
		}
	}
	
	public static void main(String[] args) {
		Tutorial6 obj = new Tutorial6();
		obj.setup();
		//obj.webElementTest();
		obj.webElementsTest();
	}
}
