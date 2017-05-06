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
public class Tutorial29 {

	WebDriver driver;
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
	}
	
	/**
	 * @param date
	 */
	public void selectDate(int date)
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@mt-id='departDate']")).click();
		List<WebElement> rowList = driver.findElements(By.xpath("//div[@class='dateFilter hasDatepicker']//div[@class='ui-datepicker-group ui-datepicker-group-first']//tbody/tr"));
		System.out.println("No. of rows : "+rowList.size());
		List<WebElement> colList = null;
		String className=null;
		int selectDate=0;
		int currentDate =0;
		boolean colBreak=false;
		boolean rowBreak=false;
		for(int i =0;i<=rowList.size()-1;i++)
		{
			colList = rowList.get(i).findElements(By.xpath("td"));
			for(int j=0;j<=colList.size()-1;j++)
			{
				className = colList.get(j).getAttribute("class").trim();
				if(className.equals("ui-datepicker-week-end ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today"))
				{
					currentDate = Integer.parseInt(colList.get(j).findElement(By.tagName("a")).getText());
					selectDate = currentDate+date;
					colBreak= true;
				}
				if(colBreak)
				{
					if(colList.get(j).findElement(By.tagName("a")).getText().equals(String.valueOf(selectDate)))
					{
						colList.get(j).findElement(By.tagName("a")).click();
						rowBreak=true;
						break;
					}
				}
			}
			if(rowBreak)
			{
				break;
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tutorial29 obj = new Tutorial29();
		obj.setup();
		obj.selectDate(12);

	}

}
