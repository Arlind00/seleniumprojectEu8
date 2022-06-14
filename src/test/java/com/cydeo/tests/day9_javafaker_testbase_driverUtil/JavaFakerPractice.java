package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {


    @Test(priority = 1)
    public void test1() {

        Faker faker = new Faker();              //Creating Faker object to reach methods
        //Faker faker = new Faker(new Locale("fr"));        // french fake generator

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println();


        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####")); // will generate random numbers in the format we want to get
        System.out.println("faker.numerify(\"312-###-####\") = " + faker.numerify("312-###-####"));
        System.out.println();

        System.out.println("faker.letterify(\"???-????\") = " + faker.letterify("???-????"));   // will return random letters where we pass "?"

        System.out.println("faker.bothify(\"##?#-##?#-#?#?#-##??\") = " + faker.bothify("##?#-##?#-#?#?#-##??"));  // return a mix of letters and numbers

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard().replaceAll("-", ""));

        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Muhtar"));


    }
}
