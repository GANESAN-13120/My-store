package com.Mouse_Based_Actions.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test { 

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\iSHIELD\\eclipse-workspace\\Selenium_Automation1\\Chrome_Driver\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("http://www.leafground.com/pages/drop.html");
		 
		 WebElement draggable = driver.findElement(By.id("draggable"));
		 Thread.sleep(7000);
		 
		 WebElement droppable = driver.findElement(By.id("droppable"));
		 Thread.sleep(7000);
		 
		 Actions a = new Actions(driver);
		 a.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
	}

}


