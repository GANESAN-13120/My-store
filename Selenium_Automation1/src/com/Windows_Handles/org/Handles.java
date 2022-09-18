package com.Windows_Handles.org;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handles {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\iSHIELD\\eclipse-workspace\\Selenium_Automation1\\Chrome_Driver103\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement cservice = driver.findElement(By.xpath("//a[text()='Customer Service']"));
		 
		Actions a = new Actions(driver);
		a.contextClick(cservice).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement fash = driver.findElement(By.xpath("//a[text()='Fashion']"));
		
		a.contextClick(fash).build().perform();
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		a.contextClick(mob).build().perform();
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		int size = driver.getWindowHandles().size();
		System.out.println(size);
		
		String pw = driver.getWindowHandle();
        System.out.println(pw);
		
		Set<String> allwindow = driver.getWindowHandles();
		for(String all:allwindow) {
			
			String title = driver.switchTo().window(all).getTitle();
			System.out.println(title);
			
		}
		
		String Actual_Title = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in\r\n"
				+ "";
		for(String aw : allwindow ) { 
			
			if(driver.switchTo().window(aw).getTitle().equals(Actual_Title)) {
				break;
			}
			System.out.println();
		}
	
		
	}    
}
