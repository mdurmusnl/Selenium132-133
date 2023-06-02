package com.myfirstproject.myfirstproject.day14;

import com.myfirstproject.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;

public class Day_14_NoSuchElementException extends TestBase {


    @Test
    public void noSuchElementExceptionTest1(){
        driver.get("https://www.amazon.com");
        /*
         *WRONG LOCATORS CAUSES NO SUCH ELEMENT EXCEPTION
         *FRAMES, WINDOWS, ALERTS, HIDDEN ELEMENTS CAUSE NO SUCH ELEMENT EXCEPTION
         * IN SHORT, IF THE ELEMENT IS NOT FOUND ON THE PAGE WE GET NO SUCH ELEMENT EXCEPTION
         */
//        driver.findElement(By.id("twotabsearchtextbox "));//NoSuchElementException
        driver.findElement(By.name("twotabsearchtextbox"));//NoSuchElementException


    }


}
