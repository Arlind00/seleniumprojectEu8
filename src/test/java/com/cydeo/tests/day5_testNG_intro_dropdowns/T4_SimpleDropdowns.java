package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropdowns {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
        System.out.println();
    }



    @Test(priority = 1)
    public void simpleDropdownTest(){

        Select simpleDropdown = new Select(driver.findElement(By.xpath("//div[@id=\"content\"]/select[@id=\"dropdown\"]")));

        WebElement currentSelOpt = simpleDropdown.getFirstSelectedOption();     // returns what is currently selected on page

        String actualSelOpt = currentSelOpt.getText();
        String expectedSepOpt = "Please select an option";

        Assert.assertEquals(expectedSepOpt,actualSelOpt);

    }


    @Test(priority = 2)
    public void simpleDropdownTest2(){

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id=\"state\"]")));
        WebElement currentSelOpt = stateDropdown.getFirstSelectedOption();     // returns what is currently selected on page

        String actualSelOpt = currentSelOpt.getText();
        String expectedSepOpt = "Select a State";

        Assert.assertEquals(expectedSepOpt,actualSelOpt);
    }


    @AfterMethod
    public void testEnded(){
        driver.quit();
    }

}


/*
TC#4: Verifying “Simple dropdown” and “State selection” dropdown
default values
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Verify “Simple dropdown” default selected value is correct
Expected: “Please select an option”
4. Verify “State selection” default selected value is correct
Expected: “Select a Stat
 */