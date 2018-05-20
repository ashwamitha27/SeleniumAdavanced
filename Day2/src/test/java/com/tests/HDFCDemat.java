package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HDFCDemat {
	@Test
	public void testHDFC() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b7a.03.26\\Desktop\\Ashwani\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("test1");
		driver.get("http://hdfcbank.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions actions=new Actions(driver);
		
		actions.
		moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products']"))).
		moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat']"))).
		moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat/demat-account']"))).
		click().perform();
		
		String title=driver.getTitle();
		
		Assert.assertTrue(title.startsWith("Demat Account"));
		
		
		
		
	}
	
	
	

}
