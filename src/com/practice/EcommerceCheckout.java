package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcommerceCheckout {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{       
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KESHAV\\Documents\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 //Implicit wait
		 //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 //Explicit wait
		 WebDriverWait uu=new WebDriverWait(driver, 5);
		 
		 String[] itemsforcart= {"Cucumber","Brocolli","Beetroot","Carrot"};
		 Thread.sleep(3000);
	     driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	     addItems(driver,itemsforcart);	 
	     driver.findElement(By.cssSelector("img[alt='Cart']")).click();
	     
	     //button[contains(text(),'PROCEED TO CHECKOUT')]  ---by using regular expression
	     driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	     //Explicit wait for the promo code is visible 
	     uu.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));
	     driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
	     driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
	     
	     //Explicit Wait	    
	      //WebDriverWait uu=new WebDriverWait(driver, 5);
	     uu.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='promoInfo']")));	     
	    
	    System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());
	     
	     
	}
	     
	     
	     public static void addItems(WebDriver driver, String[] itemsforcart)
	     {
	    	 int j=0;
	    	
			List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		     for(int i=0;i<products.size();i++)
		     {
		    	 String[] name = products.get(i).getText().split("-");
		    	 String formattedString = name[0].trim();
		    	 List<String> al = Arrays.asList(itemsforcart);
		    		// if(name.contains("Cucumber"))
		    	 
		    	 if(al.contains(formattedString))
		    		 {
		    		 j++;
		    			 driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();	
		    			 if(j==itemsforcart.length)
		    			 {
		    				 break;
		    			 }
		    		 }  		 
		    	 
		    	 
		     }     	 
	    	 
	     }

}
