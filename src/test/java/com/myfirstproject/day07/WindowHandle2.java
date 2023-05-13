package com.myfirstproject.day07;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
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

    }


}
