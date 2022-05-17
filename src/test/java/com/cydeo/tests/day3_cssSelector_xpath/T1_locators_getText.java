package com.cydeo.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {

    public static void main(String[] args) {



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

            driver.get("https://login1.nextbasecrm.com/");

            // driver.findElement(By.className("login-inp")).sendKeys("incorrect"); // directly use the function without storing it
            WebElement inputUsername = driver.findElement(By.className("login-inp"));
            inputUsername.sendKeys("incorrect");



    }
}


/*
TC #1: NextBaseCRM, locators and getText() practice
1- Open a Chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to log in button.
6- Verify error message text is as expected:
Expected: Incorrect login or password
PS: Inspect and decide which locator you should be using to locate web
elements
 */