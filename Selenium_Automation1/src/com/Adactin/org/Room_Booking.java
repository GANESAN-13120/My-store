package com.Adactin.org;

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
import org.openqa.selenium.support.ui.Select;

public class Room_Booking {
	
public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\iSHIELD\\eclipse-workspace\\Selenium_Automation1\\Chrome_Driver103\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/SearchHotel.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//1st web page
		driver.findElement(By.name("username")).sendKeys("7868830304");
		driver.findElement(By.name("password")).sendKeys("ENK75V");
		driver.findElement(By.name("login")).click();
		
		//2nd web page
		WebElement location = driver.findElement(By.name("location"));
        Select s = new Select(location);
        s.selectByValue("Melbourne");
        
        WebElement room_type = driver.findElement(By.name("room_type"));
        Select s2= new Select(room_type);
        s2.selectByValue("Super Deluxe");
        
        
        WebElement hotels = driver.findElement(By.name("hotels"));
        Select s1 = new Select(hotels);
        s1.selectByValue("Hotel Creek");
        
        
        WebElement room_nos = driver.findElement(By.name("room_nos"));
        Select s3 = new Select(room_nos);
        s3.selectByValue("4");
        
        driver.findElement(By.name("datepick_in")).sendKeys("05/07/2022");
        driver.findElement(By.name("datepick_out")).sendKeys("08/07/2022");
        
        WebElement adult_room = driver.findElement(By.name("adult_room"));
        Select s4 = new Select(adult_room);
        s4.selectByValue("4");
        
        
        WebElement child_room = driver.findElement(By.name("child_room"));
        Select s5 = new Select(child_room);
        s5.selectByValue("3");
        
        driver.findElement(By.name("Submit")).click();
        //3rd web page
        
         driver.findElement(By.name("radiobutton_0")).click();
         driver.findElement(By.name("continue")).click();

        //4th web page
         driver.findElement(By.name("first_name")).sendKeys("ganesan");
         driver.findElement(By.name("last_name")).sendKeys("subbaiah");
         driver.findElement(By.name("address")).sendKeys("Tenkasi");
         driver.findElement(By.name("cc_num")).sendKeys("1234567891023654");
         driver.findElement(By.name("cc_cvv")).sendKeys("1234");
         
         WebElement cc_type = driver.findElement(By.name("cc_type"));
         Select s6 = new Select(cc_type);
         s6.selectByValue("MAST");
         
         WebElement cc_exp_month = driver.findElement(By.name("cc_exp_month"));
         Select s7 = new Select(cc_exp_month);
         s7.selectByValue("3");
         
         WebElement cc_exp_year = driver.findElement(By.name("cc_exp_year"));
         Select s8 = new Select(cc_exp_year);
         s8.selectByValue("2022");
         driver.findElement(By.name("book_now")).click();
         //5th web page-confirmation page
         JavascriptExecutor je = (JavascriptExecutor) driver;
         je.executeScript("window.scrollBy(0,-3000)","");
 		
         Thread.sleep(5000);
         TakesScreenshot ts =(TakesScreenshot)driver;
         File source = ts.getScreenshotAs(OutputType.FILE);
         File Destination = new File("C:\\Users\\iSHIELD\\eclipse-workspace\\Selenium_Automation1\\Screen_Shots1Adactin.png");
         FileUtils.copyFile(source,Destination);
 	
        
		

}
}
