package com.myfirstproject.myfirstproject.practice02;

import com.myfirstproject.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Q06_DeleteAndDragBack extends TestBase {
      /*
     Go to URL : https://www.globalsqa.com/demo-site/draganddrop/
     Delete images by clicking delete buttons
     Recycle images by clicking Recycle buttons
     Delete images by drag and drop
     Recycle images by drag and drop
    */

    @Test
    public void test() throws InterruptedException {
 //   Go to URL : https://www.globalsqa.com/demo-site/draganddrop/
        driver.get("https://www.globalsqa.com/demo-site/draganddrop");


// Delete images by clicking delete buttons
     //first switch to iframe inorder to touch pic to delete
        //Switch to iframe
        WebElement iframe = driver.findElement(By.xpath("//iframe[@data-src='../../demoSite/practice/droppable/photo-manager.html']"));

        driver.switchTo().frame(iframe);
 // (//a[.='Delete image'])[1]  this is possible but better use list    (//a[.='Delete image']) there are 4 elemenets with this locator
    List<WebElement> deleteButtons= driver.findElements(By.xpath("//a[.='Delete image']"));
         //         for(WebElement eachElement: deleteButtons){
        //            Thread.sleep(1000);
        //               eachElement.click();
       //     }
   deleteButtons.forEach(WebElement::click);   //lambda  recommended


  //   Recycle images by clicking Recycle buttons
        List<WebElement> recycleButtons = driver.findElements(By.xpath("//a[.='Recycle image']"));
        recycleButtons.forEach(WebElement::click);
//  Delete images by drag and drop

        Thread.sleep(1000);
        List<WebElement> images = driver.findElements(By.xpath("//ul[@id='gallery']/li"));
        Actions actions = new Actions(driver);
        WebElement trash = driver.findElement(By.id("trash"));
   images.forEach(t->actions.pause(1000).dragAndDrop(t,trash).perform());



// Recycle images by drag and drop
   WebElement gallery =driver.findElement(By.id("gallery"));
     images.forEach(t->actions.dragAndDrop(t,gallery).perform());





    }



}
