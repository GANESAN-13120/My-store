 package com.Alerts.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Types {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		 System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\iSHIELD\\eclipse-workspace\\Selenium_Automation1\\Chrome_Driver\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("http://www.leafground.com/pages/Alert.html");
		 //simple alert
		 WebElement salert = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		 salert.click();
		 Alert a1 = driver.switchTo().alert();
		 Thread.sleep(3000);
		 a1.accept();
		 //confirm alert
		 WebElement calert = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		 calert.click();
		 Alert a2 = driver.switchTo().alert();
		 a2.accept();
		 Thread.sleep(3000);
		 //prompted alert
		 WebElement palert = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		 palert.click();
		 Alert a3 = driver.switchTo().alert();
		 a3.sendKeys("GANESAN INSTITUTE");
		 String text = a3.getText();
		 System.out.println(text);
		 //a3.accept();
		 Thread.sleep(7000);
		 
		 //line Break
		// WebElement linebreak = driver.findElement(By.xpath("//button[@onclick='lineBreaks()']"));
		 //linebreak.click();
		 //Alert a4 = driver.switchTo().alert();
		 //Thread.sleep(7000);
		 
		 TakesScreenshot ts = (TakesScreenshot)driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 File Destination = new File("C:\\Users\\iSHIELD\\eclipse-workspace\\Selenium_Automation1\\Screen_Shots1.sa1.png");
		 FileUtils.copyFile(source, Destination);

	}
		 
		 
		 
		 
		
	}


