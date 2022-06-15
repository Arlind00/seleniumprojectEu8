package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class T1_RegistrationForm {


    @Test
    public void registration_form_test() {

        Faker faker = new Faker();              // we create a faker

        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));                       // We opened browser and the web page

        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name=\"firstname\"]"));   // first name
        inputFirstName.sendKeys(faker.name().firstName());

        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name=\"lastname\"]"));     // last name
        inputLastName.sendKeys(faker.name().lastName());

        WebElement inputUserName = Driver.getDriver().findElement(By.xpath("//input[@name=\"username\"]"));     // username
        String user = faker.bothify("help###");                                                          // will generate 3 random numbers
        inputUserName.sendKeys(user);

        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name=\"email\"]"));
        inputEmail.sendKeys(user + "@email.com");

        WebElement inputPass = Driver.getDriver().findElement(By.xpath("//input[@name=\"password\"]"));
        inputPass.sendKeys(faker.bothify("########_????"));

        WebElement inputPhone = Driver.getDriver().findElement(By.xpath(" //input[@name=\"phone\"]"));
        inputPhone.sendKeys(faker.numerify("###-###-####"));

        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value=\"male\"]"));
        inputGender.click();

        WebElement inputBirthDate = Driver.getDriver().findElement(By.xpath("//input[@name=\"birthday\"]"));
        inputBirthDate.sendKeys("03/08/2000");
        // faker.number().numberBetween(2004,1920);

        Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name=\"department\"]")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));                   // randomize selection between (1-9)

        Select jobTitle = new Select(Driver.getDriver().findElement(By.xpath( "//select[@name=\"job_title\"]")));
        jobTitle.selectByIndex(faker.number().numberBetween(1,8));

        WebElement programingLanguage = Driver.getDriver().findElement(By.xpath("//input[@id=\"inlineCheckbox2\"]"));
        programingLanguage.click();

        WebElement signInButton = Driver.getDriver().findElement(By.xpath("//button[@id=\"wooden_spoon\"]"));
        signInButton.click();

        WebElement confirmation = Driver.getDriver().findElement(By.xpath("//p[text() =\"You've successfully completed registration!\"]"));


        String actualTitle = confirmation.getText();
        String expectedTitle = "You've successfully completed registration!";

        Assert.assertEquals(expectedTitle,actualTitle);




    }

    @AfterMethod
    public void endTest(){

    }
}


/*
TC#1: Registration form confirmation
Note: Use JavaFaker OR read from configuration.properties file when possible.
1. Open browser
2. Go to website: https://practice.cydeo.com/registration_form
3. Enter first name
4. Enter last name
5. Enter username
6. Enter email address
7. Enter password
8. Enter phone number
9. Select a gender from radio buttons
10.Enter date of birth
11.Select Department/Office
12.Select Job Title
13.Select programming language from checkboxes
14.Click to sign up button
15.Verify success message “You’ve successfully completed registration.” is
displayed.
Note:
1. Use new Driver utility class and method
2. User JavaFaker when possible
3. User ConfigurationReader when it makes sens
 */