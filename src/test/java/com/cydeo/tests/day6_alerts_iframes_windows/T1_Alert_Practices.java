package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {


    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/javascript_alerts");
    }



    @Test(priority = 1)
    public void alert_test1() throws InterruptedException {

        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        informationAlertButton.click();
        Thread.sleep(1000);


        Alert alert = driver.switchTo().alert();    // switch driver's focus to Alert to be able to click
        alert.accept();                             // Click to OK button from the alert


        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));   // Verify “You successfully clicked an alert”


        Assert.assertTrue(resultText.isDisplayed(), "Result text is NOT displayed.");       // if assert fails message appears

        String expectedText = "You successfully clicked an alert";
        String actualText = resultText.getText();

        Assert.assertEquals(actualText, expectedText, "Actual result text is not as expected!!!");
    }



    @Test(priority = 2)
    public void alert_test2() throws InterruptedException {

        WebElement jsConfirmButton = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));       // find button JS
        jsConfirmButton.click();                                                                                    // click button JS
        Thread.sleep(1500);

        Alert alert = driver.switchTo().alert();                                                                    // convert driver
        alert.accept();                                                                                             // accept alert

        WebElement clickedOk = driver.findElement(By.xpath("//p[@id=\"result\"]"));                                  // find Ok message
        Assert.assertTrue(clickedOk.isDisplayed());
    }


    @Test(priority = 3)
    public void alert_test3() throws InterruptedException {

        WebElement jsPromptButton = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        jsPromptButton.click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hello");
        alert.accept();


        WebElement verifySendKeys = driver.findElement(By.xpath("//p[@id=\"result\"]"));
        Assert.assertTrue(verifySendKeys.isDisplayed());
    }


    @AfterMethod
    public void endMethod() {
        driver.quit();
    }

}

/*
TC #1: Information alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Alert” button
4. Click to OK button from the alert
5. Verify “You successfully clicked an alert” text is displayed.


TC #2: Confirmation alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Confirm” button
4. Click to OK button from the alert
5. Verify “You clicked: Ok” text is displayed.


TC #3: Information alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Prompt” button
4. Send “hello” text to alert
5. Click to OK button from the alert
6. Verify “You entered: hello” text is displayed
 */
