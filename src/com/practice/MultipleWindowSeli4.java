package com.practice;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class MultipleWindowSeli4 {
	
	public static void main(String[] args) throws IOException
	{		
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\KESHAV\\Documents\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	     driver.get("https://rahulshettyacademy.com/angularpractice/");
	     
	     //switching into
	     driver.switchTo().newWindow(WindowType.TAB);
	     Set<String> windowHandles = driver.getWindowHandles();
	     Iterator<String> it = windowHandles.iterator();
	     String parentWindowId = it.next();
	     String childWindowId = it.next();
	     driver.switchTo().window(childWindowId);
	     driver.get("https://rahulshettyacademy.com/");
	     String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(3).getText();
	     driver.switchTo().window(parentWindowId);
	     //driver.findElement(By.cssSelector("input[name='name']")).sendKeys(courseName);
	     WebElement name = driver.findElement(By.cssSelector("input[name='name']"));
	     name.sendKeys(courseName);
	     //Taking screenshot
	     File file = name.getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(file, new File("logo.png"));
	  System.out.println(name.getRect().getDimension().getHeight());
	  System.out.println(name.getRect().getDimension().getWidth());
	     
	     
	}

}
