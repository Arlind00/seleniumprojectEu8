package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class T5_cssSelector_random {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        


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
PS2: Pay attention to where to get the text of this button fro
 */