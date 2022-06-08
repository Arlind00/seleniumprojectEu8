package com.cydeo.tests.day4_FindElements_checkBoxes_radio.Excrercise;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ae_1 {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new WebDriverFactory().getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://automationexercise.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Automation Exercise";

        if (!actualTitle.equals(expectedTitle)) {
            System.out.println("Something went wrong, check URL...");
        } else {
            System.out.println("Everything is OK");
        }       // check if its correct page
        Thread.sleep(1500);

        driver.findElement(By.xpath("//div/ul/li[4]/a")).click();     // click on sign in button

        WebElement newUserSignUp = driver.findElement(By.xpath("//div/h2[.='New User Signup!']"));      // check if correct page
        System.out.println("newUserSignUp.isDisplayed() = " + newUserSignUp.isDisplayed());
        Thread.sleep(1500);

        WebElement newUserName = driver.findElement(By.xpath("//form/input[@name='name']"));
        newUserName.click();
        newUserName.sendKeys("randomName");
        Thread.sleep(1500);

        WebElement mailAddress = driver.findElement(By.xpath(" //div[@class=\"signup-form\"]/form/input[@name=\"email\"]"));
        mailAddress.click();
        mailAddress.sendKeys("randomName@hotmail.com");
        Thread.sleep(1500);

        WebElement singIN = driver.findElement(By.xpath("//div[@class=\"signup-form\"]/form/button[@type=\"submit\"]"));
        singIN.click();
        Thread.sleep(1500);

        WebElement accountInfo = driver.findElement(By.xpath("//div[@class=\"login-form\"]/h2/b[.=\"Enter Account Information\"]"));
        System.out.println("accountInfo.isDisplayed() = " + accountInfo.isDisplayed());
        Thread.sleep(1500);

        WebElement titleInfo = driver.findElement(By.xpath("//div[@class=\"radio\"]/span/input[@id=\"id_gender1\"]"));
        titleInfo.click();
        Thread.sleep(1500);

        WebElement password = driver.findElement(By.xpath("//div[@class=\"required form-group\"]/input[@id=\"password\"]"));
        password.sendKeys("Nomennescio" + Keys.ENTER);

        WebElement dayOfBirth = driver.findElement(By.xpath("//div[@class=\"selector\"]/select[@id=\"days\"]/option[15]"));
        WebElement monthOfBirth = driver.findElement(By.xpath("//div[@id=\"uniform-months\"]/select[@id=\"months\"]/option[3]"));
        WebElement yearOfBirth = driver.findElement(By.xpath("//div[@id=\"uniform-years\"]/select[@id=\"years\"]/option[32]"));
        Thread.sleep(1500);

        WebElement newsLetter = driver.findElement(By.xpath("//input[@id=\"newsletter\"]"));
        newsLetter.click();
        Thread.sleep(1500);

        WebElement firstName = driver.findElement(By.xpath("//input[@id=\"first_name\"]"));
        firstName.sendKeys("Nomen");
        Thread.sleep(500);

        WebElement lastName = driver.findElement(By.xpath("//p/input[@id=\"last_name\"]"));
        lastName.sendKeys(" Nescio");
        Thread.sleep(500);

        WebElement company = driver.findElement(By.xpath("//p[@class=\"form-group\"]/input[@id=\"company\"]"));
        company.sendKeys("East India");
        Thread.sleep(500);

        WebElement address = driver.findElement(By.xpath("//p[@class=\"required form-group\"]/input[@id=\"address1\"]"));
        address.sendKeys("3rd rock from the Moon" + Keys.ENTER);
        Thread.sleep(500);

        WebElement country = driver.findElement(By.xpath("//select[@id=\"country\"]/option[6]"));
        WebElement state = driver.findElement(By.xpath("//p[@class=\"required form-group\"]/input[@id=\"state\"]"));
        state.sendKeys("Kosovo");
        Thread.sleep(500);

        WebElement city = driver.findElement(By.xpath("//p[@class=\"required form-group\"]/input[@id=\"city\"]"));
        city.sendKeys("Prishtina");
        Thread.sleep(500);

        WebElement zipCode = driver.findElement(By.xpath("//p[@class=\"required form-group\"]/input[@id=\"zipcode\"]"));
        zipCode.sendKeys("10000");
        Thread.sleep(500);

        WebElement mobileNumber = driver.findElement(By.xpath(" //p[@class=\"required form-group\"]/input[@id=\"mobile_number\"]"));
        mobileNumber.sendKeys("+38349300646");
        Thread.sleep(500);

        WebElement createAccountButton = driver.findElement(By.xpath("//button[@class=\"btn btn-default\"] [text()=\"Create Account\"  ]"));
        createAccountButton.click();

        WebElement verifyAccountCreated = driver.findElement(By.xpath("//h2[@class=\"title text-center\"]/b[text()=\"Account Created!\"]"));
        System.out.println(verifyAccountCreated.isDisplayed());

        WebElement continueButton = driver.findElement(By.xpath("//div[@class=\"pull-right\"]/a[@class=\"btn btn-primary\"]"));
        continueButton.click();

        // driver.close();

    }
}


/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'New User Signup!' is visible
6. Enter name and email address
7. Click 'Signup' button
8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
9. Fill details: Title, Name, Email, Password, Date of birth
10. Select checkbox 'Sign up for our newsletter!'
11. Select checkbox 'Receive special offers from our partners!'
12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
13. Click 'Create Account button'
14. Verify that 'ACCOUNT CREATED!' is visible
15. Click 'Continue' button
16. Verify that 'Logged in as username' is visible
17. Click 'Delete Account' button
18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
 */