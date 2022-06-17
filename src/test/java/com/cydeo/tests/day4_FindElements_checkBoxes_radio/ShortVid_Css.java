package com.cydeo.tests.day4_FindElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ShortVid_Css {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://search.yahoo.com/");


        WebElement searchBox = driver.findElement(By.cssSelector("#yschsp"));           // shortcut for id
        searchBox.sendKeys("it lives");
        Thread.sleep(2000);

        WebElement clearIcon =driver.findElement(By.cssSelector("button#sbq-clear>span.sprite"));
        clearIcon.click();

        searchBox.sendKeys(" selenium locator");
        Thread.sleep(2000);

        driver.quit();


    }
}
