package com.cydeo.tests.day4_FindElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ShortVid_radioButton {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement blueRadio = driver.findElement(By.id("blue"));
        System.out.println("before isSelected() = " + blueRadio.isSelected());
        blueRadio.click();

        WebElement redRadio = driver.findElement(By.id("red"));
        System.out.println("before isSelected() = " + redRadio.isSelected());
        redRadio.click();
        System.out.println("after isSelected() = " + redRadio.isSelected());
        System.out.println("after isSelected() = " + blueRadio.isSelected());


        driver.quit();


    }
}
