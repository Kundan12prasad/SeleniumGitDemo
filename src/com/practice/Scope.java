package com.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KESHAV\\Documents\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
	     driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
         System.out.println(driver.findElements(By.tagName("a")).size());  //get the count of link in entire page
	     
         
         //counts the no of links in footer
         
         WebElement footerDriver = driver.findElement(By.id("gf-BIG"));    //limiting the scope of Webdriver
         System.out.println(footerDriver.findElements(By.tagName("a")).size());
         
         //count the no of links in for the first column
         WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
         System.out.println(columnDriver.findElements(By.tagName("a")).size());
         
         //click on each link and check that each link is working or not
         
         for(int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++)
         {
        	//Opening link simultaenouly in different tab
        	 
        	 String clickonlinktab = Keys.chord(Keys.CONTROL, Keys.ENTER);
        	 columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
        	 Thread.sleep(5);
         }  
         
         //get the title of every page
        	 Set<String> abc = driver.getWindowHandles();
        	 Iterator<String> it = abc.iterator();
        	 while(it.hasNext())
        	 {
        		  driver.switchTo().window(it.next());
        		  System.out.println(driver.getTitle());
        	 }
        	 
        	 
         
	
	
	}

}
