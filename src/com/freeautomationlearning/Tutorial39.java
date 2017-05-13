/**
 * 
 */
package com.freeautomationlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author CHIRAG
 *
 */
public class Tutorial39 {

	WebDriver driver;
	public void setUP()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	public void enterUsername()
	{
		WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
		clickByJavaScript(gmailLink);
		WebElement username = driver.findElement(By.xpath("//*[@type='email']"));
		clickByJavaScript(username);
		sendKeysBYJavaScript(username, "freeautmationlearning");
	}
	
	// Click By Java Script
	public void clickByJavaScript(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	// Send Keys By Java Script
	public void sendKeysBYJavaScript(WebElement ele,String text)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+text+"')", ele);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tutorial39 obj = new Tutorial39();
		obj.setUP();
		obj.enterUsername();

	}

}
