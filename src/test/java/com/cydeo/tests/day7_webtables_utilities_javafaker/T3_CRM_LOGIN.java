package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_LOGIN extends TestBase {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test(priority = 1)
    public void crm_login_test(){


        driver.get("https://login1.nextbasecrm.com/");          //2. Go to : https://login1.nextbasecrm.com/

        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));         //3. Enter valid username
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");

        //helpdesk1@cybertekschool.com  UserUser
        //Helpdesk2@cybertekschool.com  UserUser

        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));   //4. Enter valid password
        inputPassword.sendKeys("UserUser");

        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));      //5. Click to Log In button
        loginButton.click();


        BrowserUtils.verifyTitle(driver, "Portal");         //Expected: Portal

    }

    @Test(priority = 2)
    public void crm_login_test_2(){


        driver.get("https://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver);                //Calling my utility method to login helpdesk1

        BrowserUtils.verifyTitle(driver, "Portal");       //Expected: Portal
    }


    @Test(priority = 3)
    public void crm_login_test_3(){


        driver.get("https://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver, "helpdesk2@cybertekschool.com", "UserUser" );       //Calling my utility method to login helpdesk

        BrowserUtils.verifyTitle(driver, "(2) Portal");     //Expected: Portal
    }
}
