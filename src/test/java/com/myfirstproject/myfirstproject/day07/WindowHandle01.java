package com.myfirstproject.myfirstproject.day07;

import com.myfirstproject.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Set;

public class WindowHandle01 extends TestBase   {
    @Test
    public void windowHandleTest() throws InterruptedException {
//Given user is on the https://the-internet.herokuapp.com/windows
        driver.get("https://the-internet.herokuapp.com/windows");
//Then user verifies the text : “Opening a new window”
        String page1HeaderText = driver.findElement(By.xpath("//h3[.='New Window']")).getText();
        Assert.assertEquals("Opening a new window", page1HeaderText);
//Then user verifies the title of the page is “The Internet”
        Assert.assertEquals("The Internet", driver.getTitle());

        //When user clicks on the “Click Here” button
        driver.findElement(By.xpath("//a[.='Click Here']")).click();
//     LET's GET WINDOW 1 HANDLE FIRST CAUSE WE MAY NEED TO SWITCH BACK TO WINDOW 1
        String window1Handle = driver.getWindowHandle();//Its  like an id number of the window
        System.out.println(window1Handle);  //  80895A324457687GDK6H
        //driver is still on window1
        Set<String> allWindowHnadles=driver.getWindowHandles();
        System.out.println(allWindowHnadles); //SOMETHING LIKE THIS [80895A324457687GDK6H,274539763496D577FNM66]
    for(String eachHandle : allWindowHnadles){
       if(!eachHandle.equals(window1Handle)){ //if not window1Handle then switch driver to eachHandle(means the other window)
           driver.switchTo().window(eachHandle);
           break;
       }
    }

//then user verifies the new window 2 title is "New Window"
        System.out.println("current window :" + driver.getTitle()); //274539763496D577FNM66  second window
     Assert.assertEquals("New Window",driver.getTitle());

//then user verifies the text : New Window"
        Assert.assertEquals("New Window",driver.findElement(By.xpath("//h3[.='New Window']")).getText());
//driver is now on window2
        String window2Handle=driver.getWindowHandle(); //we can use this id if we want to switch back to window1

//when user goes back to the previous window an then  verifies the title : "The Internet"
      driver.switchTo().window(window1Handle);//switches to window1,  we dont need for each loop bcs we already know the id number of window2
 //now driver is on window1
  //ok lets switch back to window2
        driver.switchTo().window(window2Handle);


    }

}
