package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Actions_Hover {


    @Test(priority = 1)
    public void hovering_test() {


        Driver.getDriver().get("https://practice.cydeo.com/hovers");        // open browser, go to web page

        WebElement image1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement image2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement image3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[text()=\"name: user1\"]"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[text()=\"name: user2\"]"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[text()=\"name: user3\"]"));


        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.sleep(1);
        actions.moveToElement(image1).perform();                // hovers mouse over the selected web element
        Assert.assertTrue(user1.isDisplayed());                 // test if given text is displayed


        Actions actions2 = new Actions(Driver.getDriver());
        BrowserUtils.sleep(1);
        actions2.moveToElement(image2).perform();
        Assert.assertTrue(user2.isDisplayed());


        Actions actions3 = new Actions(Driver.getDriver());
        BrowserUtils.sleep(1);
        actions3.moveToElement(image3).perform();
        Assert.assertTrue(user3.isDisplayed());

    }


}


/*
TC #3: Hover Test
1. Go to https://practice.cydeo.com/hovers
2. Hover over to first image
3. Assert:
    a. “name: user1” is displayed
    b. “view profile” is displayed
4. Hover over to second image
5. Assert:
    a. “name: user2” is displayed
    b. “view profile” is displayed
6. Hover over to third image
7. Confirm:
    a. “name: user3” is displayed
    b. “view profile” is display
 */