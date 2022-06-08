package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {


    WebDriver driver;               // we make it default


    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println();
    }


    @Test(priority = 1)
    public void selenium_test() {                           // test annotation should be as clean as possible

        driver.get("https://google.com");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals(driver.getTitle(), "Google");                                // compares actual with expected 1st method
        // Assert.assertEquals(actualTitle,expectedTitle, " Title doesnt match");          // compares actual with expected 2nd method
    }


    @AfterMethod
    public void tearDownMethod() {
        driver.quit();
    }
}
