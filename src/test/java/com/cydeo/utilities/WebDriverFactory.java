package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverFactory {



        public static WebDriver getDriver(String browserType){              // method initiation

        if (browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();                                      // if chrome selected open Chrome tab

        }else if(browserType.equalsIgnoreCase("edge driver")) {
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();                                        // if edge selected open edge tab

        }else {
            System.out.println("Given browser type does not exist");
            System.out.println("Driver Null");
            return null;
        }
    }
}

/*
 TASK: NEW METHOD CREATION
 Method name : getDriver
 Static method
 Accepts String arg: browserType
  - This arg will determine what type of browser is opened
   - if "chrome" passed --> it will open chrome browser
   - if "firefox" passed --> it will open firefox browser
 RETURN TYPE: "WebDriver"
 */