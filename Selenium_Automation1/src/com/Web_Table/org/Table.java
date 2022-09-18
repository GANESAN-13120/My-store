package com.Web_Table.org;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\iSHIELD\\eclipse-workspace\\Selenium_Automation1\\Chrome_Driver103\\chromedriver_win32 (1)\\chromedriver.exe");
        
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		 driver.get("https://cosmocode.io/automation-practice-webtable/");
		 driver.manage().window().maximize();
		 System.out.println("-------All Datas----------");
		 
	//	 List<WebElement> table = driver.findElements(By.xpath("//table/tbody/tr/td"));
	//	 for(WebElement all : table) {
	//		 
	//		 String text = all.getText();
	//		 System.out.println(text);
	//	 }
		 
		 System.out.println("---------Row of Data---------");
		 List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
         
         for(WebElement all : row) {
			 
			 String text = all.getText();
			 System.out.println(text);
		 }
         
         int size = row.size();
		 System.out.println(size);
		 
         
         
		 System.out.println("---------Column of Data---------");
		 List<WebElement> column = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
         
         for(WebElement all : column) {
			 
			 String text = all.getText();
			 System.out.println(text);
		 }
         
         System.out.println("-------Specific Row and Column---------");
         List<WebElement> specific = driver.findElements(By.xpath("//table/tbody/tr[3]/td[5]"));
         
         for(WebElement all : specific) {
        	 
        	 String text = all.getText();
        	 System.out.println(text);
         }
         
         
	
	}
}
