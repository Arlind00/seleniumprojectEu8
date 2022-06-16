package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_cssSelector_random {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement inputName =driver.findElement(By.xpath("//input[@name=\"USER_LOGIN\"]"));
        inputName.sendKeys("incorrect");

        WebElement inputMail = driver.findElement(By.xpath("//input[@name=\"USER_EMAIL\"]"));
        inputMail.sendKeys("incorrect@hotmail.com");

        WebElement resetButton =driver.findElement(By.xpath("//button[@value=\"Reset password\"]"));
        resetButton.click();

        WebElement notFound = driver.findElement(By.xpath("//div[text()=\"Login or E-mail not found\"]"));

        System.out.println("Login or E-mail not found has appeared: " + notFound.isDisplayed());

        driver.quit();


    }
}


/*
TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
3- Enter incorrect username into login box:
4- Click to `Reset password` button
5- Verify “error” label is as expected
Expected: Login or E-mail not found
PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from
 */