package com.cydeo.tests.day8_properties_config_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {



        @Test
        public void reading_from_properties_test() throws IOException {


            Properties properties = new Properties();        //1- Create the object of Properties

            FileInputStream file = new FileInputStream("configuration.properties");     //2- We need to open the file in java memory: FileInputStream

            properties.load(file);      //3- Load the file  using properties object

            //4- Use "properties" object to read value

            System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
            System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
            System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));


        }
    }
