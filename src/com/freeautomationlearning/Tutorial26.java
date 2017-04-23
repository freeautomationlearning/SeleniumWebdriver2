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
public class Tutorial26 {

	WebDriver driver;
	
	public void setUP()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zkoss.org/zkdemo/composite/iframe");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void testFrame()
	{
		// Switch into Tweet frame by String
		driver.switchTo().frame("twitter-widget-0");
		System.out.println(driver.findElement(By.xpath("//span[text()='Tweet']")).isDisplayed());
		// Switch to default frame
		driver.switchTo().defaultContent();
		// Sitch to frame by webelement
		WebElement frame = driver.findElement(By.className("z-iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.name("j_username")).sendKeys("TestFrame");
	}
	
	
	public void findNumberFrame()
	{
		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		int size = list.size();
		System.out.println("No of frames : "+size);
		for(int i =0;i<=size-1;i++)
		{
			try {
				System.out.println("Frame id : "+list.get(i).getAttribute("id"));
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
			
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tutorial26 obj = new Tutorial26();
		obj.setUP();
		obj.testFrame();
		//obj.findNumberFrame();

	}

}
