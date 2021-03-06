package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.Base;

public class Child extends Base{
public static void main(String[] args) throws Throwable {
	launch();
	url("https://www.facebook.com/");
	maximize();
	waits();
	WebElement search = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	tofill(search, excelRead("Sheet1", 2, 5));
	
	WebElement click = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
	tofill(click, excelRead("Sheet1", 2, 6));
	
	driver.findElement(By.xpath("//*[@id=\"u_0_d_pE\"]")).click();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
} 
}
