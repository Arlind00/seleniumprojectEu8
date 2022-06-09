package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T6_DateDropdown {


    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }


    @Test(priority = 1)
    public void dropdown_task6(){
    //Select “December 1 , 1923” and verify it is selected.
    Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
    Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
    Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));


        yearDropdown.selectByVisibleText("1923");
        monthDropdown.selectByValue("11");
        dayDropdown.selectByIndex(0);


    String expectedYear = "1923";
    String expectedMonth = "December";
    String expectedDay = "1";


    String actualYear = yearDropdown.getFirstSelectedOption().getText();
    String actualMonth = monthDropdown.getFirstSelectedOption().getText();
    String actualDay = dayDropdown.getFirstSelectedOption().getText();


        Assert.assertTrue(actualYear.equals(expectedYear));
        Assert.assertEquals(actualMonth, expectedMonth);
        Assert.assertEquals(actualDay, expectedDay);

}


    @AfterMethod
    public void setupEnd(){
        driver.quit();
    }
}

/*
TC #6: Selecting date on dropdown and verifying
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select “December 1st, 1923” and verify it is selected.
Select year using : visible text
Select month using : value attribute
Select day using : index number
 */