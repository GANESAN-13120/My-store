package com.Frames.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Single_And_Multiples {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\iSHIELD\\eclipse-workspace\\Selenium_Automation1\\Chrome_Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//Single frame
		driver.switchTo().frame("singleframe");
	    Thread.sleep(3000);
	    
	    //textbox
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("POSITIVITY");
	    Thread.sleep(3000);
	    
	    
	    TakesScreenshot ts =(TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File Destination = new File("C:\\Users\\iSHIELD\\eclipse-workspace\\Selenium_Automation1\\Screen_Shots1.SingleFrames.png");
        FileUtils.copyFile(source,Destination);
	
		
		//back to webpage
		driver.switchTo().defaultContent();
		
		//multiple frame
		//click button
	    driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
	    Thread.sleep(3000);
		
		//outer frame
		WebElement outer = driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		driver.switchTo().frame(outer);
	    Thread.sleep(3000);
		
		//inner frame
		WebElement  inner = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(inner);
	    Thread.sleep(3000);
	    
		//text box
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ALL IS WELL");
	    Thread.sleep(7000);
	    
	    TakesScreenshot Ts =(TakesScreenshot)driver;
        File source1 = Ts.getScreenshotAs(OutputType.FILE);
        File Destination1 = new File("C:\\Users\\iSHIELD\\eclipse-workspace\\Selenium_Automation1\\Screen_Shots1.MultipleFrames.png");
        FileUtils.copyFile(source1,Destination1);
	
		
	}

}
