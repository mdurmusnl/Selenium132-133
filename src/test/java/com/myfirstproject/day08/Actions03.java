package com.myfirstproject.day08;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class Actions03 extends TestBase {
    //       Create a class: ActionClass3
    //      Create test method : scrollUpDown()
    @Test
    public void scrollUpDown() throws InterruptedException {

  //      Go to amazon
        driver.get("https://www.amazon.com/");

  //      Scroll the page down
         /*
        scrolling is mouse or keyboard action, so we should use actions class
        Keys.PAGE_DOWN    scrol page down
        Keys.ARROW_DOWN   scrol page down a little bit
                            alternatively, we will use javascript executor
         */

        Actions actions =new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();// //Keys means get the control of the key board
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();// //Keys means get the control of the key board
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();// //Keys means get the control of the key board
        Thread.sleep(2000);
//we can  CHAIN these methods      -->the only difference below and between above way is no waiting between each perform
        actions.
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                build().//it works without build() method but when we have chain then build is recommended to keep them together
                perform();  //perfomr() is must

 //       Scroll the page up
       actions.sendKeys(Keys.PAGE_UP).perform();//scrol up
       actions.sendKeys(Keys.ARROW_UP).perform();//scrol up a little bit




    }



}
