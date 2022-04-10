package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KESHAV\\Documents\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	     driver.get("https://rahulshettyacademy.com/angularpractice/");
	     WebElement nameEditBox = driver.findElement(By.cssSelector("input[name='name']"));
	 System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
	 WebElement dateofBirth = driver.findElement(By.cssSelector("label[for='dateofBirth']"));
	 driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();
	 WebElement icecreamLabel = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
	 driver.findElement(with(By.tagName("input")).toLeftOf(icecreamLabel)).click();	 
	 
	 WebElement rdb = driver.findElement(By.id("inlineRadio1"));
	System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());
     
	}

}
