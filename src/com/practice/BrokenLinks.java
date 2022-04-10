package com.practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KESHAV\\Documents\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	     
	     List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	     SoftAssert a=new SoftAssert();
	     for(WebElement link:links)
	     {
	    	 String url = link.getAttribute("href");
	    	 HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		     conn.setRequestMethod("HEAD");
		     conn.connect();
		     int responseCode = conn.getResponseCode();
		     System.out.println(responseCode); 
		     
		     //softAssertion
		     a.assertTrue(responseCode<400, "The Link with Text" +link.getText()+ "is broken with code" +responseCode);
		     
		     //Hard  Assertion:
		     Assert.assertTrue(responseCode<400, "The Link with Text" +link.getText()+ "is broken with code" +responseCode);
		     
		     
		     //Hard assertion
		    /* if(responseCode>400)
		     {
		    	 System.out.println("The Link with Text" +link.getText()+ "is broken with code" +responseCode);
		    	 Assert.assertTrue(false);		    	 
		     } */  
	    	 
	    	 
	     }
	     a.assertAll();
	     
	     
	     
	     
	     
	     
	     
	     
	     //broken URL--particular URL is not working
	     //get all the URL which is tied up to the links using Selenium
	     //java methods will call the URL and gets the status code
	     //if status code>400 link tied to URL ,url is not wirking
	     
	     //String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");	     
	     //String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
	     
	     
	     /*HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
	     conn.setRequestMethod("HEAD");
	     conn.connect();
	     int responseCode = conn.getResponseCode();
	     System.out.println(responseCode); */	   

	}

}
