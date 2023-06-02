package com.myfirstproject.myfirstproject.day01_04;

import com.myfirstproject.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day05_RadioButton extends TestBase {

    // https://testcenter.techproeducation.com/index.php?page=radio-buttons
    //click on Red
    //click on Football
    @Test
    public void radioButtonTest(){
        //go to the page
        driver.get("https://testcenter.techproeducation.com/index.php?page=radio-buttons");
        //locating red
        WebElement red=driver.findElement(By.id("red"));
        red.click();
        //verifing if red is clicked
        Assert.assertTrue(red.isSelected());

   //click on Fotball
   WebElement football=driver.findElement(By.id("football"));
        football.click();
        Assert.assertTrue(football.isSelected());



    }


}
