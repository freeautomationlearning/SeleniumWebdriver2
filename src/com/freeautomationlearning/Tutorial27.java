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
public class Tutorial27 {

	String path = System.getProperty("user.dir");
	WebDriver driver;
	
	public void SetUP()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(path+"\\app\\Alerts.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void testAlert() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@onclick='confirmFunction()']")).click();
		Thread.sleep(2000);
		// Using getText, we can getText from alert/pop-up
		String textAlert = driver.switchTo().alert().getText();
		System.out.println("Alert Text :: "+textAlert);
		System.out.println("**************************************");
		// dismiss method is used to cancel a pop-up
		driver.switchTo().alert().dismiss();
		String canText = driver.findElement(By.xpath("//*[@id='confirmdemo']")).getText();
		if(canText.equals("You Clicked on Cancel!"))
		{
			System.out.println("FIRST SCENARIO IS PASSED");
		}else		
		{
			System.out.println("FIRST SCENARIO IS FAILED");
		}
		
		driver.findElement(By.xpath("//button[@onclick='promptFunction()']")).click();
		Thread.sleep(2000);
		// sendkeys is used to set text on alert
		driver.switchTo().alert().sendKeys("Chirag");
		// accept methos id used to press OK button
		driver.switchTo().alert().accept();
		String accText = driver.findElement(By.xpath("//*[@id='promptdemo']")).getText();
		if(accText.equals("Hello Chirag! Welcome to Free Automation Learning..")){
			System.out.println("SECOND SCENARIO IS PASSED");
		}else
		{
			System.out.println("SECOND SCENARIO IS FAILED");
		}
	}
	
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Tutorial27 obj = new Tutorial27();
		obj.SetUP();
		obj.testAlert();

	}

}
