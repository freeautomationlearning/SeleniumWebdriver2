/**
 * 
 */
package com.freeautomationlearning;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author CHIRAG
 *
 */
public class Tutorial21 {

	// Dropdown value from select class
	
	WebDriver driver;
	public void setUP()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	// Identify all dropdown values
	public void getOptionDropdown()
	{
		WebElement drop = driver.findElement(By.id("month"));
		Select dropdown = new Select(drop);
		List<WebElement> ele = dropdown.getOptions();
		System.out.println("No. dropdown value : "+ele.size());
		for(WebElement e : ele)
		{
			System.out.println("Text of dropdwon : "+e.getText());
		}
	}
	
	// Select a value from dropdown
	public void selectValue()
	{
		WebElement drop = driver.findElement(By.id("month"));
		Select dropdown = new Select(drop);
		String s = dropdown.getFirstSelectedOption().getText();
		System.out.println("Selected value : "+s);
		// Select By Index
		//dropdown.selectByIndex(1); 
		
		// Select By Value
		//dropdown.selectByValue("4");
		
		// Select By VisibleText
		dropdown.selectByVisibleText("Nov");
		
		String s1 = dropdown.getFirstSelectedOption().getText();
		System.out.println("Selected value : "+s1);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tutorial21 obj = new Tutorial21();
		obj.setUP();
		//obj.getOptionDropdown();
		obj.selectValue();

	}

}
