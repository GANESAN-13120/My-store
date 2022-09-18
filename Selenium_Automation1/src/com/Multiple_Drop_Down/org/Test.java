package com.Multiple_Drop_Down.org;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\iSHIELD\\eclipse-workspace\\Selenium_Automation1\\Chrome_Driver103\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/dropdowns");
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		Thread.sleep(5000);
		WebElement sdrop = driver.findElement(By.id("superheros"));
		Select s = new Select(sdrop);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		Thread.sleep(5000);
		System.out.println("-----------Print All The Names----------");
		List<WebElement> options = s.getOptions();
		for(WebElement list : options) {
			String text = list.getText();
			System.out.println(text );
		}
		
		Thread.sleep(5000);
		System.out.println("------Find the size--------");
		int size = options.size();
		System.out.println(size);
		
		Thread.sleep(5000);
		//System.out.println("------Select the names---------");
		//for(int i=0; i<=size; i++) {
			
			//if(i==8 || i==25 || i==12 || i==10) {
			//s.selectByIndex(i);
			
			//}
			
			//s.selectByValue("hb");
			//s.selectByValue("ih");
			//s.selectByValue("im");
		//}
			
			s.selectByVisibleText("Aquaman");
			s.selectByVisibleText("Captain Marvel");
			s.selectByVisibleText("Wonder Woman");
			
			
		Thread.sleep(5000);
		System.out.println("------Get all selected option-------");
		List<WebElement> allselect = s.getAllSelectedOptions();
		for(WebElement all:allselect ) {
			String text = all.getText();
			System.out.println(text);
		}
		Thread.sleep(5000);
		System.out.println("-------First select option--------");
		WebElement first = s.getFirstSelectedOption();
		String text = first.getText();
		System.out.println(text);
		
}
}
