package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {

		// Launching Chrome Browser

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KESHAV\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		// driver.close();

		// Launching Firefox Browser

//		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\KESHAV\\Documents\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://rahulshettyacademy.com");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		driver.close(); 

		// Launching Edge Browser
		/*
		 * System.setProperty("webdriver.edge.driver",
		 * "C:\\Users\\KESHAV\\Documents\\msedgedriver.exe"); WebDriver driver = new
		 * EdgeDriver(); driver.get("https://rahulshettyacademy.com");
		 * System.out.println(driver.getTitle());
		 * System.out.println(driver.getCurrentUrl());
		 * 
		 * driver.close();
		 */
	}

}
