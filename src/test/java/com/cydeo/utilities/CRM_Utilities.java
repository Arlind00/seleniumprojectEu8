package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {


    // Will log in with "helpdesk1" user account
    public static void crm_login(WebDriver driver){

        WebElement inputUsername = driver.findElement(By.xpath("//input[@name=\"USER_LOGIN\"]"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com ");

        WebElement inputPassword = driver.findElement(By.xpath("//input[@ name=\"USER_PASSWORD\"]"));
        inputPassword.sendKeys("UserUser");

        WebElement logInButton = driver.findElement(By.xpath("//input[@value=\"Log In\"]"));
        logInButton.click();
    }


    // Will log in with "helpdesk1" user account
    public static void crm_login(WebDriver driver, String username, String password){

        WebElement inputUsername = driver.findElement(By.xpath("//input[@name=\"USER_LOGIN\"]"));
        inputUsername.sendKeys(username);

        WebElement inputPassword = driver.findElement(By.xpath("//input[@ name=\"USER_PASSWORD\"]"));
        inputPassword.sendKeys(password);

        WebElement logInButton = driver.findElement(By.xpath("//input[@value=\"Log In\"]"));
        logInButton.click();
    }



}
