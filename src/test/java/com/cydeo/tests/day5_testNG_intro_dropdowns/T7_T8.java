package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T7_T8 {

    WebDriver driver;


    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test (priority = 1)
    public void test1(){

        WebElement dropDownLink = driver.findElement(By.xpath("//a[@id=\"dropdownMenuLink\"]"));
        dropDownLink.isDisplayed();
        dropDownLink.click();

        WebElement faceBook = driver.findElement(By.xpath("//a[text()='Facebook']"));
        faceBook.isDisplayed();
        faceBook.click();

        String actualTitle =  driver.getTitle();
        String expectedTitle =  "Facebook - log In or Sign Up";
        System.out.println(actualTitle);
        System.out.println(expectedTitle);

        Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle));


    }


    @Test (priority = 2)
    public void test2(){

        List<WebElement> forPrint = driver.findElements(By.xpath("//select"));

        for (WebElement each : forPrint) {
            String element = each.getText();
            System.out.println(element);
        }
        System.out.println();
        List<WebElement> forPrint2 = driver.findElements(By.xpath("//a[contains(@class,'dropdown-item')]"));
        for (WebElement each : forPrint2) {
            String element = each.getText();
            System.out.println(element);
        }

    }



    @AfterMethod
    public void setupEnd(){
        driver.quit();
    }






}


/*
TC #7: Selecting value from non-select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Click to non-select dropdown
4. Select Facebook from dropdown
5. Verify title is “Facebook - Log In or Sign Up
 */

/*
TC #8: Selecting value from multiple select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select all the options from multiple select dropdown.
4. Print out all selected values.
5. Deselect all values
 */