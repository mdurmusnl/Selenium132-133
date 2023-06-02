package com.myfirstproject.myfirstproject.day14;

import com.myfirstproject.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;

public class Day_14_TimeOutException extends TestBase {
    @Test
    public void timeOutTest1(){
        driver.get("https://www.amazon.com");
        /*
         *when driver can not locate the element even after explicit wait, then we see timeoutexception
         * max time may not be enough. increase timeout OR TRY FOLLOWING
         * SOLUTION:
         * 1. CHECK LOCATOR. CHECK SYNTAX.
         * 2. CHECK FRAMES, NEW WINDOWS, ALERTS, POP UPS, HTML ELEMENT THAT MIGHT NOT BE DISPLAYED
         * 3. DO MANUAL TEST TO COMPLETELY UNDERSTAND THE STEPS. DO CHECK YOU TEST STEPS. YOUR LOGIC AND TEST EXECUTION FLOW SHOULD BE GOOD
         */
//        USE EXPLICIT WAIT
        waitForVisibility(driver.findElement(By.name("twotabsearchtextbox")),15);//NoSuchElementexception, we used driver

        waitForVisibility(By.name("twotabsearchtextbox"),25);//TimeoutException   name should be "id"   we didnt user driver
        waitForVisibility(By.id("WRING ID-FAKE"),25);//  TimeOutException   id should be correct    we didnt use driver
        // cause after explicit wait time, element is not still found
//        driver.findElement(By.name("twotabsearchtextbox"));//NoSuchElementException
    }


}
