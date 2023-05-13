package com.myfirstproject.day10;

import com.github.javafaker.Team;
import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ScreenShotsOfEntirePage extends TestBase {
   // Create a new class: ScreenshotsOfEntirePage
    //copy the code from day09 AutoCompete

 @Test
    public void takeScreeshotOfThePage () throws InterruptedException, IOException {
     //        Given user is on https://testcenter.techproeducation.com/index.php?page=autocomplete
     driver.get("https://testcenter.techproeducation.com/index.php?page=autocomplete");
//        When user type “uni” in the search box
     //TAKE SCREENSHOT
     takeScreenShotOfTheEntirePage();

     driver.findElement(By.id("myCountry")).sendKeys("uni");
     Thread.sleep(2000);
//        And select the ‘United Kingdom’ from the suggestions
     //TAKE SCREENSHOT
     takeScreenShotOfTheEntirePage();


     //taking ss of only united kingdom element
  WebElement unikigElement=driver.findElement(By.xpath("//div[@id='myCountryautocomplete-list']//*[.='United Kingdom']"));
  takeScreenshotOfThisElement(unikigElement);

     driver
             .findElement(By.xpath("//div[@id='myCountryautocomplete-list']//*[.='United Kingdom']"))
             .click();
     Thread.sleep(2000);
//        And click on submit button
     //TAKE SCREENSHOT
     driver.findElement(By.xpath("//input[@type='button']")).click();
     Thread.sleep(2000);
     //TAKE SCREENSHOT
     takeScreeshotOfThePage();//must   actaul assertion
//        Then verify the result contains ‘United Kingdom’

  //taking ss of result element
  WebElement result=driver.findElement(By.id("result"));
  takeScreenshotOfThisElement(result);

     Assert.assertTrue(driver.findElement(By.id("result")).getText().contains("United Kingdom"));
     //TAKE SCREENSHOT  //not must to take ss
 }


 }



    // create areusable method that will take


  //  Given user search for ‘uni’
//    And select United Kingdom
//    Add click on submit button
 //   Then verify the result contains united Kingdom



