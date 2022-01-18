package com.selenium.learning;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/newtours/");
		
		Actions action = new Actions(driver);
		WebElement home = driver.findElement(By.linkText("Selenium"));
		action.moveToElement(driver.findElement(By.linkText("Home"))).build().perform();
		action.contextClick(home).build().perform(); // Mouse Right Click
		action.click(home).build().perform();
		action.doubleClick(home).build().perform();
		action.sendKeys(driver.findElement(By.name("userName")),"Nasir").build().perform();

	}

}
