package personal_practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Day08_HoverOver extends  TestBase{

    //    Create a class: Actions2
    //   Create test method : hoverOverTest() and test the following scenario:
    @Test
    public void hoverOverTest() throws InterruptedException {

        driver.get("https://www.amazon.com");
         /*
        Account is hidden under the menu.
        we need to move the mouse over the menu so account can be visible
        we can hover over menu using Actions class
         */
      WebElement menu=  driver.findElement(By.id("nav-link-accountList"));
         Actions actions =new Actions(driver);
    actions.moveToElement(menu).perform();//this is not click   it just displays the menu makes ready to clickc
        Thread.sleep(1000);
        //    When use click on “Account” link/
      driver.findElement(By.linkText("Account")).click();

//    Then verify the page title contains “Your Account”
        Assert.assertTrue(driver.getTitle().contains("Your Account"));

    }


}
