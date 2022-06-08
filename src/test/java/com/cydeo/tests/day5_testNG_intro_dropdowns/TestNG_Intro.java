package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {



    @BeforeClass                            // runs ONLY once before everything
    public void setupMethod(){
        System.out.println("-----> BeforeClass is running!");
        System.out.println();
    }



    @BeforeMethod                           // runs first before every test
    public void setUpMethod(){
        System.out.println("---> BeforeMethod is running!");
    }



    @Test(priority = 1)
    public void test1(){
        System.out.println("Test 1 is running...");

        String actual = "apple";
        String expected = "apple";
        Assert.assertEquals(actual, expected);                  // compares 2 strings from Assert class

    }



    @Test (priority = 2)
    public void test2(){
        System.out.println("Test 2 is running...");

        String actual = "apple";
        String expected = "apple";

        Assert.assertTrue(actual.equals(expected), "your message will go here");            // compares 2 strings from Assert class

    }



    @AfterMethod                            // runs after each test
    public void tearDownMethod(){
        System.out.println("---> AfterMethod is running!");
        System.out.println();
    }



    @AfterClass                             // runs after the last method is executed
    public void tearDownClass(){
        System.out.println("-----> AfterClass is running!");

    }

}
