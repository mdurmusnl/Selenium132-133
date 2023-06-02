package com.myfirstproject.myfirstproject.practice01;

import com.myfirstproject.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class MedunnaSignIn extends TestBase {

    @Test
    public void medunnaSignIn(){

        //Go to https://www.medunna.com/
        driver.get("https://www.medunna.com/");

        //Click on human sign   (profile)
        driver.findElement(By.id("account-menu")).click();

        //Click on "sign in" option
        driver.findElement(By.id("login-item")).click();

        //Enter "mark_twain" username
        driver.findElement(By.name("username")).sendKeys("mark_twain");

        //Enter "Mark.123" password
        driver.findElement(By.name("password")).sendKeys("Mark.123");

        //Click on "remember me"
        driver.findElement(By.id("rememberMe")).click();

        //Click on Sign in "Submit" button
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //Assert that you signed in
        //Homework...
        ////span[text()='Mark Twain']

        //Assert.assertEquals("Mark Twain",driver.getTitle());  failed
      // Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Mark Twain']")).isDisplayed());  passed
       String actualText=driver.findElement(By.xpath("//span[text()='Mark Twain']")).getText();  //passed
       Assert.assertEquals("Mark Twain",actualText);

    }








}
