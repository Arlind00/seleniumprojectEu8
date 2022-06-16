package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {


    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/");


        //old method
        //WebElement signInButton = driver.findElement(By.className("login-btn"));

        //new method CSS (same element through using different attributes)
        //WebElement signInButton = driver.findElement(By.cssSelector("input[class='login-btn']"));
        //WebElement signInButton = driver.findElement(By.cssSelector("input[type='submit']"));

        WebElement signInButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedButtonText = "Log In";
        String actualButtonText = signInButton.getAttribute("value");

        System.out.println("actualButtonText = " + actualButtonText);

        if (actualButtonText.equals(expectedButtonText)) {
            System.out.println("Log In button text verification passed!");
        } else {
            System.out.println("Log In button text verification failed!");

        }
//*[@id="registrationForm"]/div[10]/div/select/option[6]

    }
}


/*
TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “Log in” button text is as expected:
Expected: Log In
PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button fro
 */