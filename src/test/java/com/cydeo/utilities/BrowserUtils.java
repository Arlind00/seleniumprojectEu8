package com.cydeo.utilities;


/* Methods that are not related to some specific page*/

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {


    // Accepts int (as seconds) and execute Thread.sleep
    public void sleep(int second){              // accepts int (seconds) and execute Thread.sleep for given duration
        second *= 1000;

        try {
            Thread.sleep(second);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    // Accepts Webdriver, expectedURL, expectedTitle and returns boolean if they are the same
    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedTitle){

        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String each : allWindowHandles) {
            driver.switchTo().window(each);
            System.out.println("Current URL = " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInUrl)){                       // if current URL contains "etsy"  break
                break;
            }
        }

        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));


        /*TC #2: Create utility method
1. Create a new class called BrowserUtils
2. Create a method to make Task1 logic re-usable
3. When method is called, it should switch window and verify title.
Method info:
• Name: switchWindowAndVerify
• Return type: void
• Arg1: WebDriver
• Arg2: String expectedInUrl
• Arg3: String expectedTitle
         */
    }


    // Accepts String "expectedTitle" and Asserts if it's true
    public static void verifyTitle(WebDriver driver, String expectedTitle){

        Assert.assertEquals(driver.getTitle(), expectedTitle);

    }










}
