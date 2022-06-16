package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task_bucinca {



    WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver =  WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test(priority = 1)
    public void amazon_task(){

        WebElement searchBar = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        searchBar.sendKeys("hats for men" + Keys.ENTER);

        WebElement imgSelect = driver.findElement(By.xpath("(//span[text()=\"EINSKEY Sun Hat for Men/Women, Waterproof Wide Birm Bucket Hat UV Protection Boonie Hat for Fishing Hiking Garden Beach\"])[1]"));
        imgSelect.click();


        //driver.switchTo().window(driver.getWindowHandle());

        WebElement addToChart =driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]"));
        addToChart.click();


        Assert.assertEquals(driver.getTitle(), "Amazon.com Shopping Cart");






    }



}
