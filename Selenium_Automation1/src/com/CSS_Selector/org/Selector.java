package com.CSS_Selector.org;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selector {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
			 "C:\\Users\\iSHIELD\\eclipse-workspace\\Selenium_Automation1\\Chrome_Driver103\\chromedriver_win32 (1)\\chromedriver.exe");
	
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.instagram.com/accounts/login/");
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.cssSelector("[name='username']")).sendKeys("sganesh");
	 
	 driver.findElement(By.cssSelector("[type='password']")).sendKeys("as123");
	 
	 //driver.findElement((By.cssSelector(""))
	 
	 

}}
