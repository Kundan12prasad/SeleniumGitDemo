package com.practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Miscellaneous {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KESHAV\\Documents\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();	     
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();  //delete all the cookies
		//driver.manage().deleteCookieNamed("asdf"); //delete the cookie name with cookie name
		//click on any link
		//login page -verify login URL
		
		driver.get("https://www.google.com");
		
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(src, new File("E:\\screenshot.png"));
	
	// (forward)

	}

}
