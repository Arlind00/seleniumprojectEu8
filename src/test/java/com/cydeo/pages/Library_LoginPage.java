package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Library_LoginPage {



    public Library_LoginPage (){                                              // default constructor

        PageFactory.initElements(Driver.getDriver(), this);             // initializing Driver object and create connection between driver and current class
                                                                              // this keyword refers to object of this class
    }



    @FindBy (xpath = "//input[@placeholder=\"Email address\"]")                                     // we use FindBy annotation instead of "findElement"
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@id=\"inputPassword\"]")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[text()=\"Sign in\"]")
    public WebElement signInButton;

    @FindBy(xpath = "(//div[.=\"This field is required.\"])[1]")
    public WebElement errorMessage;

    @FindBy(xpath = "(//div[.=\"Please enter a valid email address.\"])[1]")
    public WebElement errormessageEmail;

    @FindBy(xpath = "//div[.=\"Sorry, Wrong Email or Password\"]")
    public WebElement wrongEmailOrPassword;
}


/*
TC #1: Required field error message test
        1- Open a chrome browser
        2- Go to: https://library1.cydeo.com
        3- Do not enter any information
        4- Click to “Sign in” button
        5- Verify expected error is displayed:
        Expected: This field is required.
        NOTE: FOLLOW POM DESIGN PATTERN

 */