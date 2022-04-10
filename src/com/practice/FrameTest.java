package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\KESHAV\\Documents\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();	     
	     driver.get("https://jqueryui.com/droppable/");	 
	     System.out.println(driver.findElements(By.tagName("iframe")).size());	    //return the no of frames in HTML page  
	     //driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));   //switch by web Element
	     driver.switchTo().frame(0); //switch to frame by index
	     Actions action=new Actions(driver);
	     WebElement sourceElement = driver.findElement(By.id("draggable"));
	     WebElement targerElement= driver.findElement(By.id("droppable"));	     
	     action.dragAndDrop(sourceElement, targerElement).build().perform();
         driver.switchTo().defaultContent();
	}

}
