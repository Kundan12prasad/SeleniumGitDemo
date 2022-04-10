package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException 
	{		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KESHAV\\Documents\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,500)");
		 Thread.sleep(5000);
		 js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		 
		 List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		 int sum=0;
		 for(int i=0;i<values.size();i++)
		 {
			//System.out.println(Integer.parseInt(values.get(i).getText()));
			 
			 sum=sum+Integer.parseInt(values.get(i).getText());
		 }
		 
		 System.out.println(sum);
		 driver.findElement(By.cssSelector("div[class='totalAmount']")).getText();
		 int total = Integer.parseInt(driver.findElement(By.cssSelector("div[class='totalAmount']")).getText().split(":")[1].trim());
		 Assert.assertEquals(sum, total);
		 
	}

}
