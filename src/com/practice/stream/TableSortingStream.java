package com.practice.stream;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableSortingStream {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KESHAV\\Documents\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	     driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	     //click on column
	     driver.findElement(By.xpath("//tr/th[1]")).click();
	     //capture all webelement into list
	     List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
	     
	     //capture the text of all web elements into new list (original list)
	     List<String> OriginalList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
	     
	     //sort the list of step 3
	     List<String> sortedList = OriginalList.stream().sorted().collect(Collectors.toList());
	     
	     //compare original list with sorted list
	     Assert.assertTrue(OriginalList.equals(sortedList));
	     
	     
	     //get price of each vegetable
	     //scan the new column with getText--->Beans-->print the price of Beans
	     /*List<String> price = elementsList.stream().filter(s->s.getText().
	    		 contains("Beans")).map(s->getPriceVeggie(s)).collect(Collectors.toList());	     
	     price.forEach(a->System.out.println(a));  
	     if(price.size()<1)
	     {
	    	 driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
	     } */
	     
	     //print the price of Rice with the help of pagination
	     List<String> price=null;
	     do
	     {
	    	 List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));	    	 
	         price = rows.stream().filter(s->s.getText().
		    		 contains("Rice")).map(s->getPriceVeggie(s)).collect(Collectors.toList());	     
		     price.forEach(a->System.out.println(a));  
		     if(price.size()<1)
		     {
		    	 driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
		     }
	     }  while(price.size()<1);     
	     
	     
	}
	
	
	

	private static String getPriceVeggie(WebElement s) 
	{
		
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
