package com.Xpath_Facebook;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
	
public static void main(String[] args)throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\iSHIELD\\eclipse-workspace\\Selenium_Automation1\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//x-path
		//tagName[Contains(@attributeName,'attributeValue')]
		WebElement create = driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]"));
		create.click();
		Thread.sleep(3000);
		
		//tagName[Contains(text(),'half of the text')]
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("GANESAN");
		Thread.sleep(3000);
		
		//tagName[Contains(@attributeName,'attributeValue')]
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("SUBBAIAH");
		Thread.sleep(3000);
		
		//tagName[@attributeName='attributeValue']--->Basic
		driver.findElement(By.xpath("//input[@name=\'reg_email__\']")).sendKeys("sganesh13120@gmail.com");
		Thread.sleep(3000);
		
		//tagName[@attributeName='attributeValue']--->Basic
				driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sganesh13120@gmail.com");
				//Thread.sleep(3000);
				
		
		//tagName[@attributeName='attributeValue']--->Basic
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("ss2000");
		Thread.sleep(3000);
		
		//Directly using locators name or id
		//Select by Value method
		WebElement date = driver.findElement(By.name("birthday_day"));
		Select s = new Select(date); 
		s.selectByValue("12");
		Thread.sleep(3000);
		
		//Select by Index method
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByIndex(10);
		Thread.sleep(5000);
		
		//select by visibleText method
		WebElement year = driver.findElement(By.name("birthday_year"));
        Select s2 = new Select(year);
        s2.selectByValue("2000");
        Thread.sleep(5000);
        
        //(//tagName[@attributeName='attributeValue'])[index]
        //Sigle drop down
        driver.findElement(By.xpath("(//input[@name=\"sex\"])[2]")).click();
        Thread.sleep(5000);
        
      //tagName[@attributeName='attributeValue']--->Basic
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();
        Thread.sleep(7000);
        
        //Take Screen shot
        TakesScreenshot ts =(TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File Destination = new File("C:\\Users\\iSHIELD\\eclipse-workspace\\Selenium_Automation1\\Screen_Shots1.fb2.png");
        FileUtils.copyFile(source,Destination);
	

}
}
