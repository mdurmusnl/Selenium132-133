package com.myfirstproject.myfirstproject.day07;

import com.myfirstproject.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

public class WindowHandle2 extends TestBase { //opening 3 pages in 3 tabs
   @Test
    public void newTabTest() throws InterruptedException {
 // amazon title test
 driver.get("https://www.amazon.com");
       Assert.assertTrue(driver.getTitle().contains("Amazon"));
       String amazonWindowHandle = driver.getWindowHandle();
       Thread.sleep(3000);

 // linkedin tittle test
       driver.switchTo().newWindow(WindowType.TAB);  //create a new tab and switch to it
    driver.get("https://www.linkedin.com");
       Assert.assertTrue(driver.getTitle().contains("LinkedIn"));
       String  linkedinWindowHandle=driver.getWindowHandle();
       Thread.sleep(3000);
       // ebay tittle test
       driver.switchTo().newWindow(WindowType.TAB);//CREATE A NEW TAB and switch to it
       driver.get("https://www.ebay.com");
       Assert.assertTrue(driver.getTitle().contains("eBay"));
       String ebayWindowHandle=driver.getWindowHandle();
//rifght now the driver is on EBAY,  but i can switch to amazon or LinkedIn
 driver.switchTo().window(amazonWindowHandle);//it switches the drives into amazon.com
       //then we can also switch to linked
       driver.switchTo().window(linkedinWindowHandle);
       System.out.println("current page title:"+ driver.getTitle());  //LinkedIn

   }

    @Test
    public void newWindowTest() throws InterruptedException {
// amazon title test
        driver.get("https://www.amazon.com");
        Assert.assertTrue(driver.getTitle().contains("Amazon"));//Create a new WINDOW and switch to it
        String amazonWindowHandle = driver.getWindowHandle();
        Thread.sleep(3000);

 // linkedin tittle test
        driver.switchTo().newWindow(WindowType.WINDOW);  //create a new WINDOW and switch to it
        driver.get("https://www.linkedin.com");
        Assert.assertTrue(driver.getTitle().contains("LinkedIn"));
        String  linkedinWindowHandle=driver.getWindowHandle();
        Thread.sleep(3000);
// ebay tittle test
        driver.switchTo().newWindow(WindowType.WINDOW);//CREATE a new WINDOW and switch to it
        driver.get("https://www.ebay.com");
        Assert.assertTrue(driver.getTitle().contains("eBay"));
        String ebayWindowHandle=driver.getWindowHandle();
//rifght now the driver is on EBAY,  but i can switch to amazon or LinkedIn
        driver.switchTo().window(amazonWindowHandle);//it switches the drives into amazon.com
        //then we can also switch to linked
        driver.switchTo().window(linkedinWindowHandle);
        System.out.println("current page title:"+ driver.getTitle());  //LinkedIn




        driver.get("https://www.amazon.com");
        String amazonWindow1Handle = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);  // *** this code switches the driver into the new tab automatically without a for each loop
        driver.get("https://www.linkedin.com");
        //now the driver is in new TAB or new WINDOW    We can get the hash code of current window
        String  linkedinWindow2Handle=driver.getWindowHandle();
        //then we are able to switch among the tabs since we now hash codes of each tab or window
         //for exm
        driver.switchTo().window(amazonWindow1Handle);   //now the drives is switched back to amazon page

        //if TAB is WINDOW then the logic is same



    }


}

/*

    driver.get("https://www.amazon.com");
 String amazonWindowHandle = driver.getWindowHandle();

  driver.switchTo().newWindow(WindowType.TAB);
   driver.get("https://www.linkedin.com");
 String  linkedinWindowHandle=driver.getWindowHandle();


 */