package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 
{
	public static void main(String[] args) 
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KESHAV\\Documents\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	//parent to child traversing:
	System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
	
	 //  //header/div/button[1]/parent::div
	// //header/div/button[1]/parent::div/parent::header 
	//header/div/button[1]/parent::div/parent::header/a
	//header/div/button[1]/parent::div/button[2]
	
	System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
	
	
	
	}

}
