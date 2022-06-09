package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chRoMe");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/");

        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();
        if (actualRememberMeLabel.equals(expectedRememberMeLabel)){
            System.out.println("Label verification passed");
        }else {
            System.out.println("Label verification failed");
        }


        WebElement forgotPasswordLink =  driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotPasswordLinkText = "FORGOT YOUR PASSWORD?";
        String actualForgotPasswordLinkText =  forgotPasswordLink.getText();

        if (actualForgotPasswordLinkText.equals(expectedForgotPasswordLinkText)){
            System.out.println("Forgot password verification verification passed");
        }else {
            System.out.println("Forgot password verification verification failed");
        }


        String expectedInHref = "forgot_password=yes";
        String actualInHrefAttributeValue = forgotPasswordLink.getAttribute("href");

        if(actualInHrefAttributeValue.contains(expectedInHref)){
            System.out.println("HREF attribute value verification PASSED!");
        }else {
            System.out.println("HREF attribute value verification Failed!");
        }




    }
}



/*
TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        1- Open a Chrome browser
        2- Go to: https://login1.nextbasecrm.com/
        3- Verify “remember me” label text is as expected:
        Expected: Remember me on this computer
        4- Verify “forgot password” link text is as expected:
        Expected: Forgot your password?
        5- Verify “forgot password” href attribute’s value contains expected:
        Expected: forgot_password=yes
 */
