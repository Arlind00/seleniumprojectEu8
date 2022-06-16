package com.cydeo.tests.day4_FindElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkBoxes {


    public static void main(String[] args) {



        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/checkboxes");


        WebElement checkbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));

        System.out.println("checkbox1.isSelected(), expecting false = " + checkbox1.isSelected());  // box1 not selected
        System.out.println("checkbox2.isSelected(), expecting true = " + checkbox2.isSelected());   // box2 is selected

        checkbox1.click();
        checkbox2.click();

        System.out.println("checkbox1.isSelected(), expecting true = " + checkbox1.isSelected());
        System.out.println("checkbox2.isSelected(), expecting false = " + checkbox2.isSelected());


        driver.quit();

    }
}

/*
1. Go to http://practice.cydeo.com/checkboxes
2. Confirm checkbox #1 is NOT selected by default
3. Confirm checkbox #2 is SELECTED by default.
4. Click checkbox #1 to select it.
5. Click checkbox #2 to deselect it.
6. Confirm checkbox #1 is SELECTED.
7. Confirm checkbox #2 is NOT selected.
 */
