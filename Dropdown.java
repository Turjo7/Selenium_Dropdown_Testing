package com.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("https://demoqa.com/select-menu");
		
		//driver.findElement(By.name("login")).click();
		//driver.findElement(By.id("email")).clear();
		
		/*WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("emailid");*/
		//driver.findElement(By.id("email")).sendKeys("nasir_2009bd@yahoo.com");
		//driver.findElement(By.id("pass")).sendKeys("abc");
		//String var = driver.findElement(By.name("login")).getText();
		//System.out.println(var);
		//String var1 = driver.findElement(By.className("_8e4l")).getText();
		//System.out.println(var1);
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div/div")).click();
		
		//Select select = new Select(null);
		
		//Open Browser and Navigate to the URL
		driver.navigate().to("https://demoqa.com/select-menu");
		
		// Identify the element
		
		//WebElement dropdown=driver.findElement(By.id("oldSelectMenu"));
		//enabling the dropdown option
		//Select sel = new Select(dropdown);
		//select the index of dropdown
		//sel.selectByIndex(2);
		//sel.selectByValue("10");
		//sel.deselectByVisibleText("White");
		WebElement cardropdown = driver.findElement(By.id("cars"));
		
		Select se = new Select(cardropdown);
		
		if(se.isMultiple()) {
			System.out.println("Multiple Seleted: "+ se.isMultiple());
			
		}
		else {
			System.out.println("Multiple Seleted: "+ se.isMultiple());
		}

	}

}
