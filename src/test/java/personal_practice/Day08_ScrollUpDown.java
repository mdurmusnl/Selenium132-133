package personal_practice;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Day08_ScrollUpDown extends TestBase{
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
          actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();// //Keys means get the control of the key board
        Thread.sleep(2000);
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();// //Keys means get the control of the key board
        Thread.sleep(2000);


//we can  CHAIN these methods      -->the only difference below and between above way is no waiting between each perform
   actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        //       Scroll the page up




    }



}
