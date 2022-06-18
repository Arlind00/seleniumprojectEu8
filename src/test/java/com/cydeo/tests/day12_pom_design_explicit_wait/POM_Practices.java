package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.Library_LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POM_Practices {


    @Test(priority = 1)
    public void required_field_error_message_test() {

        Driver.getDriver().get("https://library1.cydeo.com");

        Library_LoginPage library_loginPage = new Library_LoginPage();          // we create our new object

        library_loginPage.signInButton.click();

        Assert.assertTrue(library_loginPage.errorMessage.isDisplayed());

        Driver.closeDriver();

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
    }


    @Test(priority = 2)
    public void invalid_email_format_test() {

        Driver.getDriver().get("https://library1.cydeo.com");
        Faker faker = new Faker();

        //String username = faker.bothify("?????###?????.com");

        Library_LoginPage library_loginPage2 = new Library_LoginPage();
        library_loginPage2.inputUsername.sendKeys(faker.bothify("???###.cOm"));
        BrowserUtils.sleep(3);
        library_loginPage2.signInButton.click();

        Assert.assertTrue(library_loginPage2.errormessageEmail.isDisplayed());
        BrowserUtils.sleep(3);
        Driver.closeDriver();

/*
TC #2: Invalid email format error message test
        1- Open a chrome browser
        2- Go to: https://library1.cydeo.com
        3- Enter invalid email format
        4- Verify expected error is displayed:
        Expected: Please enter a valid email address.
        NOTE: FOLLOW POM DESIGN PATTERN
 */
    }


    @Test(priority = 3)
    public void incorrectUsernameOrPassword_test() {

        Driver.getDriver().get("https://library1.cydeo.com");
        Faker faker = new Faker();

        Library_LoginPage library_loginPage3 = new Library_LoginPage();
        library_loginPage3.inputUsername.sendKeys(faker.bothify("###???@###???.com"));
        BrowserUtils.sleep(3);

        library_loginPage3.inputPassword.sendKeys(faker.bothify("?#"));
        BrowserUtils.sleep(3);
        library_loginPage3.signInButton.click();

        Assert.assertTrue(library_loginPage3.wrongEmailOrPassword.isDisplayed());
        Driver.closeDriver();

   /*
    TC #3: Library negative login
1- Open a chrome browser
2- Go to: https://library1.cydeo.com
3- Enter incorrect username or incorrect password
4- Verify title expected error is displayed:
Expected: Sorry, Wrong Email or Password
NOTE: FOLLOW POM DESIGN PATTERN
     */
    }


}




