package com.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/select-menu");
		WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));
		boolean status = dropdown.isDisplayed();
		boolean statusnew = dropdown.isEnabled();
		boolean statuslatest = dropdown.isSelected();
		
		System.out.println(status);
		System.out.println(statusnew);
		System.out.println(statuslatest);
		driver.close();

	}

}
