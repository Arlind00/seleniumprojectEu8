package com.cydeo.tests.day4_FindElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShortVid_CheckBox {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/checkboxes");

        WebElement checkbox1 =driver.findElement(By.id("box1"));
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        checkbox1.click();
        System.out.println("after click = " + checkbox1.isSelected());

        WebElement checkbox2 = driver.findElement(By.id("box2"));
        System.out.println("checkbox2.getAttribute(\"checked\") = " + checkbox2.getAttribute("checked"));
        checkbox2.click();
        System.out.println("after unchecking it = " + checkbox2.getAttribute("checked"));

        if( ! checkbox1.isSelected() ){
            checkbox1.click();
        }else{
            System.out.println("checkbox1 is already selected");
        }

        driver.quit();
    }
}
