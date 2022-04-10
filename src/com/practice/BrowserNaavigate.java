package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNaavigate {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KESHAV\\Documents\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	     driver.get("https://www.google.com");
	     driver.manage().window().maximize();
	     driver.navigate().to("https://rahulshettyacademy.com/");
	     driver.navigate().back();
	     driver.navigate().forward();

	}

}
