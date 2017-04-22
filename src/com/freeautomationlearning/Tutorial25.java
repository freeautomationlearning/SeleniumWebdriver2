/**
 * 
 */
package com.freeautomationlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author CHIRAG
 *
 */
public class Tutorial25 {

	WebDriver driver;

	public void setUP()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void handleWin()
	{

		driver.findElement(By.xpath("//a[text()='Employer Zone']")).click();
		switchWin("Employer's Login: Recruitment Solutions from Naukri.com");
		driver.findElement(By.name("username")).sendKeys("HCLHRTEAM");
	}

	// Switch Window by passing window number
	public void switchWin(int i)
	{
		Object[] win = driver.getWindowHandles().toArray();
		driver.switchTo().window((String)win[i]);
	}

	// Switch Window by passing window title
	public void switchWin(String title)
	{
		String getTitle = null;
		Object[] win = driver.getWindowHandles().toArray();
		for(int i =0;i<=win.length-1;i++)
		{
			driver.switchTo().window((String)win[i]);
			getTitle = driver.getTitle();
			if(getTitle.equalsIgnoreCase(title))
			{
				break;			}
		}

	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tutorial25 obj = new Tutorial25();
		obj.setUP();
		obj.handleWin();

	}

}
