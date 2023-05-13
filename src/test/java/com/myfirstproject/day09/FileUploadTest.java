package com.myfirstproject.day09;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUploadTest extends TestBase {
    //we can click Choose File by Selenium  but we can not choose a file from desktop by Selenium
//click Choose File and click upload button by Selenium
    @Test
    public void fileUploadTest () {
/*
        We use sendKeys functions to upload files if the html is INPUT TYPE=FILE
        If other element is used to upload files, then we can use ROBOT class in JAVA
         */

        driver.get("https://the-internet.herokuapp.com/upload");
//        to upload a file to this type of element, we should send the path of the file to the input
//        element is TAG = INPUT, TYPE = FILE
//        locate the chose a file element, get the path of teh file, then use send keys function
        WebElement chooseAFile = driver.findElement(By.id("file-upload")); //we get the cotrol of Choose a file button later line we wil give action of sendKey
        String userHome = System.getProperty("user.home");
        String pathOfDLicence=userHome+"\\OneDrive\\Desktop\\licence.jpeg.jpg";
        chooseAFile.sendKeys(pathOfDLicence);//uploading with the path i gave to sendKeys()method
        //above is like picked a doc or file to upload
 //click on the upload button by selenium
 driver.findElement(By.id("file-submit")).click();
//then verify the file uploaded  "Message displayed"

        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='content']//h3")).isDisplayed());
              ////div[@id='content']//h3    -->parent to child   div is parent tag  h3 is child tag
    }



}
