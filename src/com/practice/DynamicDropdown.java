package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KESHAV\\Documents\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	     driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	     
	   //a[@value='BLR']
	   //a[@value='MAA']
	     
	   //  (//a[@value='MAA'])[2]
	 //  (//a[@value='MAA'])[2]
	     driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	     driver.findElement(By.xpath("//a[@value='BLR']")).click();
	     Thread.sleep(2000);
	     //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	     driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	     
	   //div[@id='ctl00_mainContent_ddl_originStation1_CTNR']  //a[@value='MAA']---parent child relationship
	     //ctl00_mainContent_ddl_destinationStation1_CTNR
	   //div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']  //a[@value='MAA']
	     
	     //calender
	    driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();	     
	     

	}

}
