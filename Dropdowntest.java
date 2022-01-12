package com.selenium.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowntest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/select-menu");

		WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));

		Select se = new Select(dropdown);

		List<WebElement> list = se.getOptions();

		System.out.println("The Dropdown Options Are: ");

		for (WebElement options : list) {
			
			try {
				System.out.println(options.getText());
			}catch(Exception ex) {
				System.out.println(ex);
			}

		}
		
		System.out.println("The Data of Index [4]: "); 
        se.selectByIndex(4);  // Purple will be selected in the browser
        
        System.out.println("Select value is: " + se.getFirstSelectedOption().getText()); // Fetching the Text of the selected field
        
        System.out.println("Selecting the Option by Visible Text Magenta");
        se.selectByVisibleText("Magenta"); // Magenta will be selected in the browser
        System.out.println("Select value is: " + se.getFirstSelectedOption().getText());
        
        System.out.println("Select the Option by HTML tag value 6: ");
        se.selectByValue("6");
        System.out.println("Select value is: " + se.getFirstSelectedOption().getText());
        driver.quit();


	}

}
