package com.cydeo.tests.day4_FindElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShortVid_1 {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/");

        WebElement firstElement = driver.findElement(By.className("list-group-item"));
        System.out.println("firstElement = " + firstElement.getText());

        List<WebElement> allElements = driver.findElements(By.className("list-group-item"));
        System.out.println("allElements.size() = " + allElements.size());


    }
}
