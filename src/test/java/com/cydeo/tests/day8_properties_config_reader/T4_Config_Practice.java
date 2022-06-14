package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_Config_Practice {

    /*
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        String browserType = ConfigurationReader.getProperty("browser");        // we are reading browser type from configuration.properties
        driver = WebDriverFactory.getDriver(browserType);
        driver.manage().window().maximize();
    }

     */

    @Test
    public void google_search_test() {

        Driver.getDriver().get("https://www.google.com");               // we use method created in static Driver class getDriver();

        WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));

        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);  // we use data from configuration.properties

        String expectedTitle = ConfigurationReader.getProperty("searchValue") + " - Google Search";     // search-value will change dynamically through configuration.properties
        String actualTitle = Driver.getDriver().getTitle();

        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);

        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
