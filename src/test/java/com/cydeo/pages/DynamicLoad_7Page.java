package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad_7Page {


    public DynamicLoad_7Page() {                                // we create constructor and instantiate driver and object class
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//strong[.=\"Done!\"]")
    public WebElement doneMessage;


    @FindBy(xpath = "//img[@alt=\"square pants\"]")
    public WebElement spongeBobImage;
}