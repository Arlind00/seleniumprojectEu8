package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {



        WebDriverManager.chromedriver().setup();       // 1. Setup browser driver
        WebDriver driver = new ChromeDriver();         // 2. Create instance of Selenium web driver
        driver.manage().window().maximize();           // 3. This will maximize the browser size


        driver.get("https://www.tesla.com");           // Go to Tesla web page
        String name = driver.getTitle();               // Go to Tesla take the Title
        System.out.println("page name = " + name);
        name = driver.getCurrentUrl();                 // Go to Tesla take the URL
        System.out.println("name = " + name);


        Thread.sleep(1500);                     // 4.0 adding time before navigating back
        driver.navigate().back();                    // 4.1 use selenium to navigate back

        Thread.sleep(1500);                     // 4.2 adding time before navigating forward
        driver.navigate().forward();                 // 4.3 navigate forward

        Thread.sleep(1500);                     // 4.4 adding time before navigating refresh
        driver.navigate().refresh();                 // 4.5 navigate refresh

        Thread.sleep(1500);                              // 4.5 adding time before navigating to google
        driver.navigate().to("https://www.google.com");     // 4.7 go from tesla to google


        name = driver.getTitle();                              // 4.8 get the title of the page
        System.out.println("page name = " + name);


        name = driver.getCurrentUrl();                         // 4.9 Get URL using Selenium
        System.out.println("name = " + name);

        driver.close();             // Will close the current opened window

        driver.quit();              // will close several opened windows



    }
}
