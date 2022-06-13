package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_LOGIN {


    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test (priority = 1)
    public void crm_login_test(){

        driver.get("https://login1.nextbasecrm.com/");

        WebElement inputUsername = driver.findElement(By.xpath("//input[@name=\"USER_LOGIN\"]"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com ");

        WebElement inputPassword = driver.findElement(By.xpath("//input[@ name=\"USER_PASSWORD\"]"));
        inputPassword.sendKeys("UserUser");

        WebElement logInButton = driver.findElement(By.xpath("//input[@value=\"Log In\"]"));
        logInButton.click();

        BrowserUtils.verifyTitle(driver, "Portal");                 // our custom made method

    }


    @Test (priority = 2)
    public void crm_login_test2(){

        driver.get("https://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver);                               // our custom made method

        BrowserUtils.verifyTitle(driver, "Portal");         // our custom made method
    }


    @Test (priority = 3)
    public void crm_login_test3() throws InterruptedException {

        driver.get("https://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver, "Helpdesk2@cybertekschool.com", "UserUser" );                               // our custom made method

        BrowserUtils.verifyTitle(driver, "Portal");         // our custom made method
    }


    @AfterMethod
    public void endSetup(){
        driver.quit();
    }
}


/*
TC #3: Login scenario
1. Create new test and make set-ups
2. Go to : http://login1.nextbasecrm.com/
3. Enter valid username
4. Enter valid password
5. Click to `Log In` button
6. Verify title is as expected:
Expected: Portal

         USERNAME                PASSWORD
helpdesk1@cybertekschool.com     UserUser
Helpdesk2@cybertekschool.com     UserUse
 */