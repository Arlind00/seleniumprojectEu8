package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Short_DataProvider {

    WebDriver driver;

    @Test (dataProvider = "searchData")                                         // we enter DataProvider name that we assigned
    public void test1(String keyword, String expectedTitle){                    // we assign two Strings as argument that will come from DataProvider

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://googe.com");

        WebElement searchbox = driver.findElement(By.name("q"));                // chrome shows warning for unsafe environment ????
        searchbox.sendKeys(keyword + Keys.ENTER);

        Assert.assertEquals(driver.getTitle(), expectedTitle);

        driver.quit();
    }



    @DataProvider (name = "searchData")
    public Object[][] testData(){                           // methods name

        return new Object[][] {
            {"selenium", "selenium - Google Search"},
            {"java", "java - Google Search"},
            {"job", "job - Google Search"},
            {"cydeo", "cydeo - Google Search"}
        };

    }
}
