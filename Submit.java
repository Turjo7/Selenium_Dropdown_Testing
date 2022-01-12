package com.selenium.learning;

import java.awt.Point;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Submit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Turjo");
		WebElement btn = driver.findElement(By.id("nav-search-submit-button"));
		btn.submit();
		
		List<WebElement> options = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<options.size();i++) {
			String gettext = options.get(i).getText();
			System.out.println(gettext);
		}
		
		
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		org.openqa.selenium.Point point = element.getLocation();
		System.out.println("X cordinate : " + point.x + "Y cordinate: " + point.y);
		

	}

}
