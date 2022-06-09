package com.cydeo.tests.day4_FindElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T6_staleException {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/abtest");

        WebElement cydeoLink = driver.findElement(By.cssSelector("a[href='https://cydeo.com/']"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());


        driver.navigate().refresh();
        cydeoLink = driver.findElement(By.cssSelector("a[href='https://cydeo.com/']"));    // reassign after refreshing page
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

        driver.quit();

    }
}


/*
TC #6: StaleElementReferenceException Task
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate “CYDEO” link, verify it is displayed.
4- Refresh the page.
5- Verify it is displayed, again
 */