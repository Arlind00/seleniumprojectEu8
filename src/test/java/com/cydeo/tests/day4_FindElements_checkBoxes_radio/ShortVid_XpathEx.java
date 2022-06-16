package com.cydeo.tests.day4_FindElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ShortVid_XpathEx {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://search.yahoo.com/");


        WebElement searchBox = driver.findElement(By.xpath("//div[@class='sbq-w']/input[@type='text']"));
        System.out.println("searchBox.isDisplayed() = " + searchBox.isDisplayed());
        searchBox.click();
        searchBox.sendKeys("google" + Keys.ENTER);

        driver.quit();

    }
}
