package com.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/radio.html");
		WebElement cb = driver.findElement(By.id("vfb-7-1"));
		cb.click();
		
		if(cb.isSelected()==false) {
			cb.click();
			System.out.println("Checked");
		}else {
			System.out.println("Not Checked");
		}
	}

}
