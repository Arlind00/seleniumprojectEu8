package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoolgeSearch {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.google.com");
        WebElement googleSearch = driver.findElement(By.name("q"));
        googleSearch.sendKeys("apple" + Keys.ENTER);                 // sends String from IntelliJ to webpage
                                                                                   // then clicks ENTER


        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title Verification passed");
        }else   {
            System.out.println("Title Verification failed");
        }

    }
}



/*
TC#3: Google search
        1- Open a chrome browser
        2- Go to: https://google.com
        3- Write “apple” in search box
        4- Click google search button
        5- Verify title:
        Expected: Title should start with “apple” word
 */