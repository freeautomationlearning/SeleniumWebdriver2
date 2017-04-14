/**
 * 
 */
package com.freeautomationlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

/**
 * @author CHIRAG
 *
 */
public class Tutorial17 {

	WebDriver driver;
	public void setUP()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		// I am not giving any implicity wait
	}
	
	// Explicit Wait
	public void testExplicitWait()
	{
		By ele = By.xpath("//a[text()='Gmail']");
		// Syntax of Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(ele, "Gmail"));
	}
	
	// Fluent wait
	public void testFluentWait()
	{
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.MILLISECONDS);
		wait.until(new Function<WebDriver, Boolean>() {

			@Override
			public Boolean apply(WebDriver arg0) {
				// TODO Auto-generated method stub
				return driver.findElement(By.xpath("//a[text()='Gmail']")).getText().equals("Gmail1");
			}
		});
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tutorial17 obj =new Tutorial17();
		obj.setUP();
		//obj.testExplicitWait();
		obj.testFluentWait();

	}

}
