package com.myfirstproject.day09;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Authentication extends TestBase {
    @ Test
    public void authTest(){
        /*
        username: admin
        password:admin
        url     :the-internet.herokuapp.com/basic_auth
         */
//        driver.get("http://the-internet.herokuapp.com/basic_auth");
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        //        assert if login is successfull
        String actualLoginText = driver.findElement(By.xpath("//div[@id='content']//p")).getText();
             ////div[@id='content']//p   --> p tag is child of div tag   p tag contains Congratulations
        Assert.assertTrue(actualLoginText.contains("Congratulations!"));



    }


}
