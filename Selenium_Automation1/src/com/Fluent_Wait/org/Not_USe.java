package com.Fluent_Wait.org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Explicit_Wait.org.Wait;

public class Not_USe {
	
public static void main(String[] args, WebElement firstname) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\iSHIELD\\eclipse-workspace\\Selenium_Automation1\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		  
		//x-path
		//tagName[Contains(@attributeName,'attributeValue')]
		WebElement create = driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]"));
		create.click();
		
		//tagName[Contains(text(),'half of the text')]
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("GANESAN");
		
		//tagName[Contains(@attributeName,'attributeValue')]
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("SUBBAIAH");
		
		//tagName[@attributeName='attributeValue']--->Basic
		driver.findElement(By.xpath("//input[@name=\'reg_email__\']")).sendKeys("sganesh13120@gmail.com");
		
		//tagName[@attributeName='attributeValue']--->Basic
				driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sganesh13120@gmail.com");
				//Thread.sleep(3000);
				
		
		//tagName[@attributeName='attributeValue']--->Basic
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("ss2000");
		
		//Directly using locators name or id
		//Select by Value method
		WebElement date = driver.findElement(By.name("birthday_day"));
		Select s = new Select(date); 
		s.selectByValue("12");
		
		//Select by Index method
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByIndex(10);
		
		//select by visibleText method
		WebElement year = driver.findElement(By.name("birthday_year"));
        Select s2 = new Select(year);
        s2.selectByValue("2000");
        
        //(//tagName[@attributeName='attributeValue'])[index]
        //Sigle drop down
        driver.findElement(By.xpath("(//input[@name=\"sex\"])[2]")).click();
        
      //tagName[@attributeName='attributeValue']--->Basic
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();
        
        //fluent wait
      /*  Wait w = new FluentWait(driver)
        		.withTimeout(Duration.ofSeconds(3000))
                .pollingEvery(Duration.ofSeconds(4))
                .ignoring(Exception.class);*/

}






}
