package com.Keyboard_Based_Action.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
			 "C:\\Users\\iSHIELD\\eclipse-workspace\\Selenium_Automation1\\Chrome_Driver103\\chromedriver_win32 (1)\\chromedriver.exe");
	
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.google.com/");
	 driver.manage().window().maximize();
	 
	 WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
	 Actions a = new Actions(driver);
	 
	 a.click().build().perform();
	 
	 a.doubleClick(gmail).build().perform();
	 
	 a.moveToElement(gmail).build().perform();
	 
	 a.contextClick(gmail).build().perform();
	 
	 Robot r = new Robot();
	 
	 Thread.sleep(3000);
	 r.keyPress(KeyEvent.VK_PAGE_DOWN);
	 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	 
	 Thread.sleep(3000);
	 r.keyPress(KeyEvent.VK_PAGE_DOWN);
	 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	 
	 Thread.sleep(3000);
	 r.keyPress(KeyEvent.VK_PAGE_DOWN);
	 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	 
	 Thread.sleep(3000);
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	 
	 
	 
	}
}
