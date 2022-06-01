package com.cydeo.tests.day2_locators_getText_getAttribute;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_GetText_GetAttribute {

    public static void main(String[] args) {

       // WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");        // opens via the method we wrote

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");

        WebElement headerText =driver.findElement(By.tagName("h2"));
        String actualHeaderText = headerText.getText();
        String expectedHeaderText = "Registration form";

        if (actualHeaderText.startsWith(expectedHeaderText)){
            System.out.println("Title Verification passed");
        }else   {
            System.out.println("Title Verification failed");
        }


        WebElement firstNameInput = driver.findElement(By.className("form-control"));
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");

        if (actualPlaceHolder.startsWith(expectedPlaceHolder)){
            System.out.println("Place Holder Verification passed");
        }else   {
            System.out.println("Place Holder Verification failed");
        }

        driver.close();

    }
}



/*
TC #5: getText() and getAttribute() method practice
1- Open a Chrome browser
2- Go to: https://practice.cydeo.com/registration_form
3- Verify header text is as expected:
Expected: Registration form
4- Locate “First name” input box
5- Verify placeholder attribute’s value is as expected:
Expected: first name
 */