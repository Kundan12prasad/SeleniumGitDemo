package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KESHAV\\Documents\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	     driver.get("https://www.path2usa.com/travel-companions");
	     driver.findElement(By.xpath("//input[@id='travel_date']")).click();
	    // driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']")).getText().contains("April")
	    while(!driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']")).getText().contains("May"))
	    {
	    	driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();
	    	
	    }
	     driver.findElements(By.className(".day"));
	     //grab the common attribute,put it into the list and iterate
	     int count = driver.findElements(By.className("day")).size();
	     for(int i=0;i<count;i++)
	     {
	    	 String text = driver.findElements(By.className("day")).get(i).getText();
	    	 if(text.equalsIgnoreCase("28"))
	    	 {	    		 
	    		 driver.findElements(By.className("day")).get(i).click();
	    		 break;	    		 
	    	 }
	    	 
	    	 //th[class='datepicker-switch'
	    	// div[class='datepicker-days'] th[class='datepicker-switch'] (tag are optional in CSS)
	    	 //div[class='datepicker-days'] th[class='next']
	     }

	}

}
