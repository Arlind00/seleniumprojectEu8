package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T5_Windows_Practice {


    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/windows");
    }


    @Test
    public void multiple_window_test() {

        String mainHandle = driver.getWindowHandle();                   // useful to store main-handle
        System.out.println("mainHandle = " + mainHandle);
        System.out.println();

        String expectedTitle = "Windows";                               // handle qe e deshirojme te kemi
        String actualTitle = driver.getTitle();                         // handle aktual
        Assert.assertEquals(actualTitle, expectedTitle);                // krahasojme kto 2 handle

        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();                                                      // new tab is opened


        Set<String> allWindowHandles = driver.getWindowHandles();                   // window handle 1 - main window
                                                                                    // window handle 2 - 2nd window

        for (String each : allWindowHandles) {                                      // to be able to run all tabs we need forEach loop
            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: " + driver.getTitle());
        }


        String expectedTitleAfterClick = "New Window";
        actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitleAfterClick);
        System.out.println("Title after click: " + actualTitle);
        
        //driver.switchTo().window(mainHandle);         // to go back to main page
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();      // closes the window
       // driver.quit();      // closes the tab
    }
}









/*
TC #5: Window Handle practice
1. Create a new class called: T5_WindowsPractice
2. Create new test and make set ups
3. Go to : https://practice.cydeo.com/windows
4. Assert: Title is “Windows”
5. Click to: “Click Here” link
6. Switch to new Window.
7. Assert: Title is “New Window”
 */