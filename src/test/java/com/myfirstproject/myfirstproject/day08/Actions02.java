package com.myfirstproject.myfirstproject.day08;

import com.myfirstproject.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actions02 extends TestBase {
    //    Create a class: Actions2
    @Test
    public void hoverOverTest() throws InterruptedException {
  //   Create test method : hoverOverTest() and test the following scenario:
        driver.get("https://www.amazon.com");
         /*
        Account is hidden under the menu.
        we need to move the mouse over the menu so account can be visible
        we can hover over menu using Actions class
         */

        WebElement menu = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();//the menu gets open to be clicked . we just did mouse move over menu bar
       Thread.sleep(1000);
        //    When use click on “Account” link/
      driver.findElement(By.linkText("Account")).click();  //its a link  so no need to inspect  just locate bu linkText and name of the link

//    Then verify the page title contains “Your Account”
        Assert.assertTrue(driver.getTitle().contains("Your Account"));


    }



}
