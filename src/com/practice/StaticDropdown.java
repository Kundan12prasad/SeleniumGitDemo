package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {      

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\KESHAV\\Documents\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	     driver.get("https://www.google.com");
	     driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	     WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	     Select dropdown=new Select(staticDropDown);
	     dropdown.selectByIndex(2);
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	    dropdown.selectByVisibleText("USD");
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	    dropdown.selectByValue("INR");
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	     
		
	}

}
