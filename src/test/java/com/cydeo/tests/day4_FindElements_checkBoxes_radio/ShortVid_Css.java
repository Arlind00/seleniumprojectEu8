package com.cydeo.tests.day4_FindElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShortVid_Css {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://search.yahoo.com/");

        WebElement searchBox = driver.findElement(By.cssSelector("#yschsp"));
        searchBox.sendKeys("it lives");
        Thread.sleep(2000);

        WebElement clearIcon =driver.findElement(By.cssSelector("button#sbq-clear>span.sprite"));
        clearIcon.click();

        searchBox.sendKeys(" selenium locator");
        Thread.sleep(2000);

        driver.quit();


    }
}
