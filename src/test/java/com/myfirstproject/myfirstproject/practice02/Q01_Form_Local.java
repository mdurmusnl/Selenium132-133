package com.myfirstproject.myfirstproject.practice02;

import org.junit.Test;
import org.openqa.selenium.By;
import personal_practice.TestBase;

import java.util.Set;

public class Q01_Form_Local extends TestBase {

 /*
    Given go to file:///C:/Users/TechProEd/Desktop/Html-Css%20Batch132-133/index.html
    Click on "Click Here For Regisration Form"
    Enter username: John
    Enter password: John.123
    Fill the form
    Click Confirm
     */

    @Test
    public void test() throws InterruptedException {
//        Given go to file:///C:/Users/TechProEd/Desktop/Html-Css%20Batch132-133/index.html
        driver.get("file:///C:/Users/mdurm/OneDrive/Desktop/my-html-css/practice02.html");

//        Click on "Click Here For Regisration Form"
String window1Handle= driver.getWindowHandle();
        driver.findElement(By.partialLinkText("tion Form")).click();
        Thread.sleep(1000);
    driver.switchTo().alert().sendKeys("a");
    driver.switchTo().alert().accept();
        Thread.sleep(1000);
    driver.switchTo().alert().sendKeys("a");
    driver.switchTo().alert().accept(); //this will accepts the psw we sent
        Thread.sleep(1000);
   driver.switchTo().alert().accept();//thias will accept ok button



    }

}
