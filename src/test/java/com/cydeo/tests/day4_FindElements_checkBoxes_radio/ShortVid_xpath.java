package com.cydeo.tests.day4_FindElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShortVid_xpath {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/registration_form");

        WebElement firstName = driver.findElement(By.cssSelector("div>input[name=\"firstname\"]"));
        System.out.println("firstName.isDisplayed() = " + firstName.isDisplayed());
        firstName.sendKeys("Arlind");
        Thread.sleep(500);

        WebElement lastName = driver.findElement(By.cssSelector("div>input[name=\"lastname\"]"));
        System.out.println("lastName.isDisplayed() = " + lastName.isDisplayed());
        lastName.sendKeys("Bucinca");
        Thread.sleep(500);

        WebElement userName = driver.findElement(By.cssSelector("div>input[name=\"username\"]"));
        System.out.println("userName.isDisplayed() = " + userName.isDisplayed());
        userName.sendKeys("ab123456");
        Thread.sleep(500);

        WebElement email = driver.findElement(By.cssSelector("div.col-sm-5>input[name=\"email\"]"));
        System.out.println("email.isDisplayed() = " + email.isDisplayed());
        email.sendKeys("ab123456@hotmail.com");
        Thread.sleep(500);

        WebElement password = driver.findElement(By.cssSelector("div.col-sm-5>input[name=\"password\"]"));
        System.out.println("password.isDisplayed() = " + password.isDisplayed());
        password.sendKeys("001123456789");
        Thread.sleep(500);

        WebElement phoneNumber = driver.findElement(By.cssSelector("div.col-sm-5>input[name=\"phone\"]"));
        System.out.println("phone number.isDisplayed() = " + phoneNumber.isDisplayed());
        phoneNumber.sendKeys("410-092-1234");
        Thread.sleep(500);

        WebElement gender = driver.findElement(By.cssSelector("label>input[value='male'][name=\"gender\"]"));
        System.out.println("gender.isDisplayed() = " + gender.isDisplayed());
        gender.click();
        Thread.sleep(500);

        WebElement dateOfBirth = driver.findElement(By.cssSelector("div.col-sm-5>input[name=\"birthday\"]"));
        System.out.println("dateOfBirth.isDisplayed() = " + dateOfBirth.isDisplayed());
        dateOfBirth.sendKeys("02/14/1991");
        Thread.sleep(500);

        WebElement office = driver.findElement(By.cssSelector("div.col-sm-5>select [value=\"MCTC\"]"));
        System.out.println("office.isDisplayed() = " + office.isDisplayed());
        office.click();
        Thread.sleep(500);

        WebElement jobTitle = driver.findElement(By.cssSelector("div.col-sm-5>select[name=\"job_title\"]"));
        System.out.println("jobTitle.isDisplayed() = " + jobTitle.isDisplayed());
        jobTitle.click();
        Thread.sleep(500);

        WebElement java = driver.findElement(By.cssSelector("#registrationForm > div:nth-child(10) > div > select > option:nth-child(5)"));
        System.out.println("java.isDisplayed() = " + java.isDisplayed());
        java.click();
        Thread.sleep(500);

        WebElement signIn = driver.findElement(By.cssSelector("button.btn-primary[id=\"wooden_spoon\"]"));
        System.out.println("signIn.isDisplayed() = " + signIn.isDisplayed());
        signIn.click();

        Thread.sleep(500);

        driver.quit();


    }
}
