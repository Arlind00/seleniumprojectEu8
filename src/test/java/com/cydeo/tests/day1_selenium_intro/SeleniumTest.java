package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException{


        WebDriverManager.chromedriver().setup();    // 1. Setting up the web driver manager

        WebDriver driver = new ChromeDriver();      // 2. Create instance of the chrome driver
        driver.manage().window().maximize();

        driver.get("https://www.google.com");       // 3. Test if driver is working as expected

        Thread.sleep(2000);
        driver.close();

    }
}
