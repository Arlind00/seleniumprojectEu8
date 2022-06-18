package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4_ActionPractices {


    @Test(priority = 1)
    public void scroll_test(){

        Driver.getDriver().get("https://practice.cydeo.com/");

        WebElement poweredByCydeo = Driver.getDriver().findElement(By.xpath("//a[text()=\"CYDEO\"]"));      // locating element in order to be able to pass as argument in actions
        Actions actions = new Actions(Driver.getDriver());          // we pass driver instance
        actions.moveToElement(poweredByCydeo).pause(3000).perform();

        Driver.closeDriver();               // it will terminate the driver and assign a null value to it, when a driver instance is called will execute in new driver
    }


    @Test(priority = 2)
    public void scroll_Test2(){

        WebElement homeButton =Driver.getDriver().findElement(By.xpath("//a[@class=\"nav-link\"]"));
        Actions actions2 = new Actions(Driver.getDriver());
        actions2.moveToElement(homeButton).pause(3000).perform();           // best way

        // actions2.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();         // not very secure way

        Driver.closeDriver();           // it will terminate the driver and assign a null value to it (one test is independent of other tests)
    }

}

/*
TC #4: Scroll practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/
3- Scroll down to “Powered by CYDEO”
4- Scroll using Actions class “moveTo(element)” method

TC #5: Scroll practice 2
1- Continue from where the Task 4 is left in the same test.
2- Scroll back up to “Home” link using PageUP button
 */