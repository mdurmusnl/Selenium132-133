package com.myfirstproject.day09;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class AutoComplete extends TestBase {

    @Test
    public void autoCompleteTest() throws InterruptedException {
                //for exm google suggestion when u search "ipho"  then u get "iphone 14"
//        Given user is on https://testcenter.techproeducation.com/index.php?page=autocomplete
        driver.get("https://testcenter.techproeducation.com/index.php?page=autocomplete");
//        When user type “uni” in the search box
        //TAKE SCREENSHOT
        driver.findElement(By.id("myCountry")).sendKeys("uni");
        Thread.sleep(1000);
//        And select the ‘United Kingdom’ from the suggestions
        //TAKE SCREENSHOT
        driver              //do inspection after u type "uni" in the box
                .findElement(By.xpath("//div[@id='myCountryautocomplete-list']//*[.='United Kingdom']"))  //xpath from parent to child
                .click();   // -->   //*[.='United Kingdom'] also works  //div[.='United Kingdom'] also possible
//        And click on submit button
        //TAKE SCREENSHOT
        driver.findElement(By.xpath("//input[@type='button']")).click();
        Thread.sleep(1000);
//        Then verify the result contains ‘United Kingdom’
        Assert.assertTrue(driver.findElement(By.id("result")).getText().contains("United Kingdom"));
    }



}
