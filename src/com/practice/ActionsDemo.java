package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\KESHAV\\Documents\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
	     driver.get("https://www.amazon.com");
	     Actions actions=new Actions(driver);
	     WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));  
	     
	     
	     actions.moveToElement(driver.findElement(By.id("twotabsearchtextbox")))
	     .click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();
	     
	      //first build and then execute by perform method();	 
	     //contextClick() is basically used to perform the right click();
	     actions.moveToElement(move).contextClick().build().perform();
	     
	     
		
		

	}

}
