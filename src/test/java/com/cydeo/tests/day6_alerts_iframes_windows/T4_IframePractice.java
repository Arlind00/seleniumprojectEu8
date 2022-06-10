package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_IframePractice {


    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/iframe");
    }


    //@Ignore                                   // (1st way) to ignore test immediately under @Ignore adn pas to next test
    @Test                                       // (2nd way) double slash in order method not to be a test
    public void iframe_test(){


        //option #1- switching to iframe using id attribute value

        // driver.switchTo().frame("mce_0_ifr");     // 1st way of switching
        // driver.switchTo().frame(0);               // 2nd way of switching (if only one iframe then it has 0 index)

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));        // 3rd way of switching driver to frame

        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));                  // locate element within iframe
        Assert.assertTrue(yourContentGoesHereText.isDisplayed());                                  // verify element is displayed


        driver.switchTo().parentFrame();                                                           // return driver to initial form

        WebElement headerText = driver.findElement(By.xpath("//h3"));                              // locate element in html
        Assert.assertTrue(headerText.isDisplayed());                                               // verify element in html

    }


    @AfterMethod
    public void endTest(){
        driver.quit();
    }

    }



/*
TC #4: Iframe practice
1. Create a new class called: T4_Iframes
2. Create new test and make set-ups
3. Go to: https://practice.cydeo.com/iframe
4. Assert: “Your content goes here.” Text is displayed.
5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor
 */