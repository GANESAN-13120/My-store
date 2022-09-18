package com.JavaScriptExecutor.org;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\iSHIELD\\eclipse-workspace\\Selenium_Automation1\\Chrome_Driver103\\chromedriver_win32 (1)\\chromedriver.exe");

		String url ="https://www.amazon.in/";
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		JavascriptExecutor je = (JavascriptExecutor) driver;//narrowCasting
		//scroll down
		je.executeScript("window.scrollBy(0,3000)","");
		
		 TakesScreenshot Ts =(TakesScreenshot)driver;
	        File source1 = Ts.getScreenshotAs(OutputType.FILE);
	        File Destination1 = new File("C:\\Users\\iSHIELD\\eclipse-workspace\\Selenium_Automation1\\Screen_Shots1.scroll_Down.png");
	        FileUtils.copyFile(source1,Destination1);
		
		//scroll up
		je.executeScript("window.scrollBy(0,-3000)","");
		
		 TakesScreenshot T =(TakesScreenshot)driver;
	        File source2 = T.getScreenshotAs(OutputType.FILE);
	        File Destination2 = new File("C:\\Users\\iSHIELD\\eclipse-workspace\\Selenium_Automation1\\Screen_Shots1.scroll_up.png");
	        FileUtils.copyFile(source2,Destination2);
		 
		
		WebElement amazon = driver.findElement(By.xpath("//a[text()='Sell on Amazon']"));
		
		JavascriptExecutor am = (JavascriptExecutor) driver;
		
		am.executeScript("arguments[0].scrollIntoView[true]", amazon);
		
		am.executeScript("arguments[0].click()",amazon );
		
	}

}
