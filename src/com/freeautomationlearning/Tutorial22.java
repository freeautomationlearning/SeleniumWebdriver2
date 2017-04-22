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

/**
 * @author CHIRAG
 *
 */
public class Tutorial22 {

	WebDriver driver;
	
	public void setUP()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.phptravels.net/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	
	public void selectLanguage(String lan)
	{
		driver.findElement(By.xpath("//li[@class='pull-left width_change']/a")).click();
		List<WebElement> lanList= driver.findElements(By.xpath("//li[@class='pull-left width_change open']//ul/li"));
		System.out.println("Number of Language : "+lanList.size());
		String lanText=null;
		for(int i=0;i<=lanList.size()-1;i++)
		{
			lanText = lanList.get(i).findElement(By.tagName("a")).getAttribute("data-langname");
			System.out.println("Found Lan : "+lanText);
			if(lanText.equalsIgnoreCase(lan))
			{
				lanList.get(i).findElement(By.tagName("a")).click();
				break;
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tutorial22 obj = new Tutorial22();
		obj.setUP();
		obj.selectLanguage("Hebrew");

	}

}
