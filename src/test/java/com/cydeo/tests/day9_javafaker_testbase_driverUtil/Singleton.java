package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

public class Singleton {


     private Singleton(){}                  // we create private constructor

     private static String word;            // create private static String

     public static String getWord(){        // will return the word the way we choose to


         if (word == null){
             System.out.println("First time call. Word object is null, assign value now");
             word = "something";

         }else {
             System.out.println("Word already has value");
         }
         return word;
     }
}
