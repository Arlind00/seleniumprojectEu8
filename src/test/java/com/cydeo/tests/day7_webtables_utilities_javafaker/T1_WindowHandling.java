package com.cydeo.testSs.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T1_WindowHandling {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test (priority = 1)
    public void windowHandlingTest(){

        driver.get("https://www.amazon.com");

        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");      // at same tab opens new window
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");

        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String each : allWindowHandles) {
            driver.switchTo().window(each);
            System.out.println("Current URL = " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains("etsy")){                       // if current URL contains "etsy"  break
                break;
            }
        }


        String actualTitle = driver.getTitle();
        String expectedTitle = "Etsy";

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }


    @AfterMethod
    public void endMethod(){
        driver.quit();
    }

}



/*
C #1: Window Handle practice
1. Create new test and make set ups
2. Go to : https://www.amazon.com
3. Copy paste the lines from below into your class
4. Create a logic to switch to the tab where Etsy.com is open
5. Assert: Title contains “Etsy”
Lines to be pasted:
((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
These lines will simply open new tabs using something called JavascriptExecutor
and get those pages. We will learn JavascriptExecutor later as well.
 */