package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
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
    }


    @Test(priority = 2)
    public void scroll_Test2(){

        WebElement homeButton =Driver.getDriver().findElement(By.xpath("//a[@class=\"nav-link\"]"));

        BrowserUtils.sleep(5);
        Actions actions2 = new Actions(Driver.getDriver());
        actions2.moveToElement(homeButton).perform();
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