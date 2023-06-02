package com.myfirstproject.myfirstproject.DAY13;

import com.myfirstproject.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait extends TestBase {
    //    Create a class:ExplicitWait
//    Create a method: explicitWait
//    Go to https://the-internet.herokuapp.com/dynamic_loading/1

//    Then verify the ‘Hello World!’ Shows up on the screen
    @Test
    public void explicitWaitTest() {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");     ////div[@id='start']//button
        //    When user clicks on the Start button
       WebElement startButton = driver.findElement(By.xpath("//div[@id='start']//button"));  ////button[.='Start']
       startButton.click();
     //hard wait
     //Thread.sleep(10000); it solves the problem but takes time

     //we already have implicit wait in TestBase   but doesnt solve    idont know why
           //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

 //let's try explicit wait
           //1st create WebDriverWait object
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
           //2nd use the object to handle the issue
        wait.until(ExpectedConditions.visibilityOf( driver.findElement(By.xpath("//div[@id='finish']//h4")) ));

       WebElement helloWorld=driver.findElement(By.xpath("//div[@id='finish']//h4"));
        Assert.assertEquals("Hello World!",helloWorld.getText());

    }


    @Test
    public void explicitWaitTest2() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement startButton = driver.findElement(By.xpath("//div[@id='start']//button"));
        startButton.click();
//        TRYING EXPLICIT WAIT
//        1. create webdriverwait object
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//        2. use the wait object to handle the wait issue
        WebElement helloWorld = wait.until(ExpectedConditions.visibilityOf( driver.findElement(By.xpath("//div[@id='finish']//h4"))  ));
//        WebElement helloWorld=driver.findElement(By.xpath("//div[@id='finish']//h4"));
        Assert.assertEquals("Hello World!",helloWorld.getText());
    }

    @Test
    public void explicitWaitTest3(){
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement startButton = driver.findElement(By.xpath("//div[@id='start']//button"));
        startButton.click();
//        WAIT FOR ELEMENT USING EXPLICIT WAIT
//        THIS IS RECOMMENDED. WE SHOULD USE REUSABLE METHODS IN AUTOMATION
        WebElement helloWorld = waitForVisibility(driver.findElement(By.xpath("//div[@id='finish']//h4")),20);
        Assert.assertEquals("Hello World!",helloWorld.getText());
    }

    }
