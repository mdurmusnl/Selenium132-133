package personal_practice;

import org.bouncycastle.jcajce.provider.drbg.DRBG;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Day08_Actions1ContextClick extends TestBase{
    /*
   Create a class: Actions1
Create a test method : contextClickMethod() and test the following scenario:
  */
    @Test
    public void contextClickTest(){
        driver.get("https://testcenter.techproeducation.com/index.php?page=context-menu");
        //        When use Right clicks on the box  -->its not in the tesct case but we neeed to create an action
        WebElement box=driver.findElement(By.id("hot-spot"));
        Actions actions= new Actions(driver);
        actions.contextClick(box).perform();


//             Then verify the alert message is “You selected a context menu”
   Assert.assertTrue(driver.switchTo().alert().getText().contains("You selected a context menu"));

        //            Then accept the alert
        driver.switchTo().alert().accept();

    }



}
