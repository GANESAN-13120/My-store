package com.My_Store.org;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Online_Purchase {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\iSHIELD\\eclipse-workspace\\Selenium_Automation1\\Chrome_Driver103\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.findElement(By.name("email")).sendKeys("sganesh13120@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("SG@ganesh13120");
		driver.findElement(By.name("SubmitLogin")).click();
        
		WebElement women = driver.findElement(By.xpath("//a[text() ='Women']"));
        women.click();  
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,1500)","");
		//add to cart
		Actions a = new Actions(driver);
		a.moveToElement(women );
		WebElement add = driver.findElement(By.linkText("Add to cart")); 
		a.moveToElement(add);
		add.click();
		driver.findElement(By.linkText("Proceed to checkout")).click(); 
        //summary
		je.executeScript("window.scrollBy(0,1500)","");
		driver.findElement(By.linkText("Proceed to checkout")).click(); 
       //adress
		je.executeScript("window.scrollBy(0,1500)","");
		driver.findElement(By.name("processAddress")).click(); 
		//shipping
		je.executeScript("window.scrollBy(0,1500)","");
		driver.findElement(By.name("cgv")).click(); 
		driver.findElement(By.name("processCarrier")).click(); 
        //payment
		je.executeScript("window.scrollBy(0,1500)","");
		driver.findElement(By.cssSelector("[title='Pay by bank wire']")).click(); 
        //confirm order
		je.executeScript("window.scrollBy(0,1500)","");
		driver.findElement(By.xpath("//span[text()='I confirm my order']")).click(); 
        //ScreeenShot
		 TakesScreenshot ts =(TakesScreenshot)driver;
         File source = ts.getScreenshotAs(OutputType.FILE);
         File Destination = new File("C:\\Users\\iSHIELD\\eclipse-workspace\\Selenium_Automation1\\Screen_Shots1MyStore .png");
         FileUtils.copyFile(source,Destination);
 	
        




		
	}

}
