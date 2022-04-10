package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdaateDropdown {

	public static void main(String[] args) {		

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\KESHAV\\Documents\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	     driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	     
	     driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	     

	}

}
