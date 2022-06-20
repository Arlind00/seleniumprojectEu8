package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.DynamicLoad_7Page;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverWaitPractices {


    @Test(priority = 1)
    public void dynamic_load_7_test(){

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);     // we instantiate wait object up to 10 secs
        wait.until(ExpectedConditions.titleIs("Dynamic title"));                           // object will wait for this condition to appear


        DynamicLoad_7Page dynamicLoad_7Page = new DynamicLoad_7Page();                     // create object to reach and assert web elements
        Assert.assertTrue(dynamicLoad_7Page.doneMessage.isDisplayed());
        Assert.assertTrue(dynamicLoad_7Page.spongeBobImage.isDisplayed());



        /*
        TC#4 : Dynamically Loaded Page Elements 7
1. Go to https://practice.cydeo.com/dynamic_loading/7
2. Wait until title is “Dynamic title”
3. Assert: Message “Done” is displayed.
4. Assert: Image is displayed.
Note: Follow POM
         */
    }
}
