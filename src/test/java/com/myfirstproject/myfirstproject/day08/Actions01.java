package com.myfirstproject.myfirstproject.day08;

import com.myfirstproject.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actions01 extends TestBase {
    /*
    Create a class: Actions1
Create a test method : contextClickMethod() and test the following scenario:
   */
         @Test
    public void contextClickTest(){
             driver.get("https://testcenter.techproeducation.com/index.php?page=context-menu");
   //        When use Right clicks on the box  -->its not in the tesct case but we neeed to create an action
             WebElement box = driver.findElement(By.id("hot-spot"));
             Actions actions= new Actions(driver);
            actions.contextClick(box).perform();  //right-click on the box

//             Then verify the alert message is “You selected a context menu”
      Assert.assertTrue(driver.switchTo().alert().getText().equals("You selected a context menu"));

 //            Then accept the alert
             driver.switchTo().alert().accept();

         }
}
