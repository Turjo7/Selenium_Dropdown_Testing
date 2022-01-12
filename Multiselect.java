package com.selenium.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/select-menu");

		WebElement dropdown = driver.findElement(By.id("cars"));

		System.out.println("The dropdown options are -");
		Select se = new Select(dropdown);

		List<WebElement> options = se.getOptions();

		for (WebElement option : options) {
			try {
				System.out.println(option.getText());
			} catch (Exception ex) {
				System.out.println(ex);
			}
		}

		if (se.isMultiple()) {

			System.out.println("Select Option Opel by Index");
			se.selectByIndex(2);

			System.out.println("Select Option Audi by Text");
			se.selectByVisibleText("Audi");

			System.out.println("The selected values in the dropdown options are -");

			List<WebElement> selectedOptions = se.getAllSelectedOptions();

			for (WebElement selectedOption : selectedOptions) {
				try {
					System.out.println(selectedOption.getText());
				} catch (Exception ex) {
					System.out.println(ex);
				}
			}
			
			System.out.println("DeSelect option Audi by Index");
            se.deselectByIndex(3);
            
            System.out.println("Select option Opel by Text");
            se.deselectByVisibleText("Opel");
            
            
            System.out.println("The selected values after deselect in the dropdown options are -");
            List<WebElement> selectedOptionsAfterDeselect = se.getAllSelectedOptions();

            for(WebElement selectedOptionAfterDeselect: selectedOptionsAfterDeselect) {
            	try {
            		System.out.println(selectedOptionAfterDeselect.getText());
				} catch (Exception ex) {
					System.out.println(ex);
				}
            }
            se.deselectAll();
                


		}
		driver.quit();

	}

}
