package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");
        //  driver.findElement(By.linkText("A/B Testing")).click();
        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));     // element we found we assign to a variable WebElement
        abTestLink.click();                                                         // WebElement variable that contains element from webpage
                                                                                    // clicks on that specific element

        String expectedTitle = "A/B Testing";
        String actualTitile = driver.getTitle();

        if (actualTitile.contains(expectedTitle)){
            System.out.println("Title Verification passed");
        }else   {
            System.out.println("Title Verification failed");
        }

        driver.navigate().back();

        expectedTitle = "Practice";
        actualTitile = driver.getTitle();

        if (actualTitile.contains(expectedTitle)){
            System.out.println("Title Verification passed");
        }else   {
            System.out.println("Title Verification failed");
        }



    }
}

/*
TC #2: Back and forth navigation
1- Open a Chrome browser
2- Go to: https://practice.cydeo.com
3- Click to A/B Testing from top of the list.
4- Verify title is:
Expected: No A/B Test
5- Go back to home page by using the .back();
6- Verify title equals:
Expected: Practice
 */