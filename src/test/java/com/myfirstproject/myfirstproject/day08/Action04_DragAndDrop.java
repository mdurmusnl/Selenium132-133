package com.myfirstproject.myfirstproject.day08;

import com.myfirstproject.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action04_DragAndDrop extends TestBase {
    @Test
    public void dragAndDropTest(){   //most preferred one
        //    Given user is on https://jqueryui.com/droppable/
        driver.get("https://jqueryui.com/droppable/");
 //    And user moves the target element(Drag me to my target) in to destination(Drop here)
        driver.switchTo().frame(0);//if you dont switch then driver would not see the source and target
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
//        we will move the source in the target so we should use actions class

        Actions actions = new Actions(driver);
        actions.dragAndDrop(source,target).perform();
    }
    //lets do same task with another way
    @Test
    public void dragAndDropByTest(){
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);//if you dont switch then driver would not see the source and target
        WebElement source = driver.findElement(By.id("draggable"));

        Actions actions = new Actions(driver);
        actions.dragAndDropBy(source,401,138).perform();//it moves the target in to a specific coordinate


    }
    @Test
    public void clickAndHoldTest(){   //as same as draganddrop   but this isnot recommended
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);//if you dont switch then driver would not see the source and target
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
       actions.clickAndHold(source).moveToElement(target).build().perform();

    }

}
