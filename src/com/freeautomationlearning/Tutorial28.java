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
public class Tutorial28 {

	WebDriver driver;
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/trains/22692");
	}
	
	// This method for Identify Text by Row Number and Col Num
	public void getTextByRowColNum(int row,int col,String givenText)
	{
		String text=null;
		try {
			text = driver.findElement(By.xpath("//div[@class='resultTable fixBody']//tr["+row+"]/td["+col+"]")).getText();
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(givenText.equals(text))
		{
			System.out.println("Found Text : "+text);
		} else
		{
			System.out.println("No Text Found");
		}
	}	
	// This method is for get Text of Complete WebTable
	public void getTextWebtable()
	{
		// No of Rows
		List<WebElement> rowList = driver.findElements(By.xpath("//div[@class='resultTable fixBody']//tr"));
		System.out.println("No of Rows :"+rowList.size());
		List<WebElement> colList = null;
		for(int i =0;i<=rowList.size()-1;i++)
		{
			// No of Column 
			colList = rowList.get(i).findElements(By.xpath("td"));
			for(int j=0;j<=colList.size()-1;j++)
			{
				System.out.print(colList.get(j).getText()+" : ");
			}
			System.out.println();
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tutorial28 obj = new Tutorial28();
		obj.setUp();
		//obj.getTextByRowColNum(6, 6, "1660 km");
		obj.getTextWebtable();
	}

}
