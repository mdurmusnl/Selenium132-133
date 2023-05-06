package com.myfirstproject;

import com.github.javafaker.Faker;
import org.junit.Test;

public class Day05_JavaFaker {   //java faker comes from github library
    /*
    data: username, password, phone number,date of birth, city ssn number....
    where do u get your test data in your company?
    answer : BA. writes the Acceptance criteria or requirement
    --test lead
    --maula tester
    --tech lead(teamlead)
    --PO maintains the product backlog
    --developers
    --from database
    --from API call (the response we get is a data)
    --and
           we can also get data by ajva faker if we need some fake data
     */

@Test
    public void javaFaker(){
    //create a Faker object
    Faker faker= new Faker();
    //use faker object and generate a fake test data
    String  firstName=faker.name().firstName();
    System.out.println(firstName);
      //lastnam
    System.out.println("lastname"+faker.name().lastName());
    System.out.println("title"+faker.name().title());
    System.out.println("city"+faker.address().city());
    System.out.println("state"+faker.address().state());
    System.out.println("full address"+faker.address().fullAddress());
    System.out.println("random 10 digit number"+faker.number().digits(10));
    System.out.println("cellphone number"+faker.phoneNumber().cellPhone());
    System.out.println("ssn number"+faker.idNumber().ssnValid());
    System.out.println("email"+ faker.internet().emailAddress());
    System.out.println("date of birth"+ faker.date().birthday());


}


}
