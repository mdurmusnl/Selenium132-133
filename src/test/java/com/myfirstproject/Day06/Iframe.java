package com.myfirstproject.Day06;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import personal_practice.TestBase;

public class Iframe extends TestBase {
   //  https://testcenter.techproeducation.com/index.php?page=iframe   this is a page inside a page
    // click on the Back to TechProEducation


  @Test
    public void iframeTest(){
//going to the page
      driver.get("https://testcenter.techproeducation.com/index.php?page=iframe");

      //
      // the element is inside an iframe so first we switch frame
     //switching to the first frame by index
             // driver.switchTo().frame(0);   by index
   // switching to frame by id is possible if the web element has an id
    //the real web page does not has an iframe like below   its just axample for id and name
//  <iframe src="/index.php" width="100%" height="300" style="border:1px solid black id="frame-123" name="fname";">
//    </iframe>
    // driver.switchTo().frame("frame=123");   by id
  //     driver.switchTo().frame("fname"); //by name

    //attention  if u switch by id or name then no need other steps but if u switch by web element then u need an extra step
    WebElement frameElement=driver.findElement(By.xpath("//iframe[@src='/index.php']")); //by web element
       driver.switchTo().frame(frameElement);


      //locating the element inside the frame and trying to click
    //  driver.findElement(By.xpath("//a[@type='button']")).click(); //this location fails maybe its an alert or maybe its inside an iframe
//even the teachers code didnt work   and he did JavascriptExecuter js= (JavascriptExecuter)driver;

    //        location the element inside the frame and trying to click
    WebElement element = driver.findElement(By.xpath("//a[@type='button']"));


    JavascriptExecutor js= (JavascriptExecutor)driver;
    js.executeScript("arguments[0].click();",element);
   //now driver is inside the iframe, now driver can not see the elements on the main page bcs its inside the iframe

//assert if h3 element's text is equal to "iframe"   check if the text at the top of iframe on the main page is "iframe" or not
    //first switch driver back to parent frame or default content
    driver.switchTo().parentFrame();
      // driver.switchTo().defaultContent();  in this case this is also possible  its alos a superman go to multiple level upper
    String actualHeaderText =driver.findElement(By.xpath("//h3")).getText();   ////h3[text()='iframe']
    Assert.assertEquals("iframe",actualHeaderText);





  }




}
