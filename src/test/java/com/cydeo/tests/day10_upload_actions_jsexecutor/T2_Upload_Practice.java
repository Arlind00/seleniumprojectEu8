package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Practice {



    @Test
    public void upload_test(){

        Driver.getDriver().get("https://practice.cydeo.com/upload");                                                  // opening browser and URL

        String path = "C:\\Users\\dijar\\OneDrive\\Desktop\\EU8_Review_Week_Optional_Tasks.docx";    // selecting the path of picture to upload

        WebElement fileUpload =Driver.getDriver().findElement(By.id("file-upload"));   // locating the element
        BrowserUtils.sleep(2);
        fileUpload.sendKeys(path);

        WebElement uploadButton =Driver.getDriver().findElement(By.id("file-submit"));
        BrowserUtils.sleep(2);
        uploadButton.click();

        WebElement fileUploadedHeader =Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadedHeader.isDisplayed());



    }

}

/*
TC #2 Upload Test
1. Go to https://practice.cydeo.com/upload
2. Find some small file from your computer, and get the path of it.
3. Upload the file.
4. Assert:
-File uploaded text is displayed on the pag
 */