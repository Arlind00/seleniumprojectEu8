package com.cydeo.tests.day4_FindElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class RapTap {


    @Test
    public void rapid_test(){
        WebDriver driver = WebDriverFactory.getDriver("https://practice.cydeo.com/registration_form");


      //  Select select = new Select(driver.findElement(By.xpath("\"//select[@class=\\\"form-control selectpicker\\\"]\"")));

        List<WebElement> allElements = driver.findElements(By.xpath(""));



    }
}
