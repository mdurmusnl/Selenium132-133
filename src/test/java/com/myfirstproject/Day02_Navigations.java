package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Navigations {
    public static void main(String[] args) {
        // 1st set up
        System.setProperty("webdriver.chrome.driver","src/resourses/drivers/chromedriver.exe");
        //2nd  create the driver object
        WebDriver driver =new ChromeDriver();
        //3rd  now that we haave our driver insrance, we can START CREATING OUR TEST SCRIPT
        //maximize the window
      driver.manage().window().maximize();   //we alwas should maximize the page
        //open google home page https://www.walmart.com/.NBSP
      driver.get("https://www.walmart.com");
        //On the same class , Navigate to amazon home page htps://www.amazon.com/
    // driver.get("htps://www.amazon.com");  //both are same  there is a litte difference we will learn later
    driver.navigate().to("htps://www.amazon.com");
        //Navigate back to google
     driver.navigate().back();
        // Navigate forward to amazon
   driver.navigate().forward();
        //refresh the page
   driver.navigate().refresh();
        //close/quit th browser   --> seleium does not close the browse automatically  we need to close   2 ways to close the browser
           //  driver.close();
        driver.quit();


        /*
        get()  and navigate() methods
        the similarity is both let you go to the page
        the difference are:
            get() is more common
            get() accepts Only String as Url , navigate().to() is overloaded and accepts String url or url (url means we create a url object by Url class)
            navigate() method has more options such as to(), back9), forward(), refresh()
         */

/*
     quit()                 and          close()  methods
     closes all active browsers    closes only the last active browser
     recommended one is quit()
 */


    }
}
