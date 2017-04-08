package com.freeautomationlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tutorial15 {

	WebDriver driver;
	public void testXpathTool()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@id='u_0_q']")).click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tutorial15 obj = new Tutorial15();
		obj.testXpathTool();
	}
}
